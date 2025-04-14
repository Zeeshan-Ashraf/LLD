package tictactoe;

import java.util.Scanner;

public class Play {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayingPlayer;

    public Play(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        currentPlayingPlayer = player1;

        System.out.println("player1: " + player1.getName());
        System.out.println("player2: " + player2.getName());
        board.printBoard();
    }

    public void play() {
        while (true){
            System.out.println(currentPlayingPlayer.getName()+"'s turn: provide row col");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int row;
            int col;
            try {
                    row = Integer.parseInt(input.split(" ")[0]);
                    col = Integer.parseInt(input.split(" ")[1]);
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }

            Player move;
            try {
                move = board.move(row, col, currentPlayingPlayer);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            board.printBoard();

            if (move == null) {
                if (board.getStatus() == Status.DRAW) {
                    System.out.println("Draw");
                    break;
                }
            } else {
                System.out.println("Winner is: " + move.getName());
                break;
            }
            currentPlayingPlayer = currentPlayingPlayer == player1 ? player2 : player1;
        }
    }

}
