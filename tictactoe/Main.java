package tictactoe;


/**
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.f9671za7ug40
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to tictactoe!");

        Player player1 = new Player("Zee", Symbol.O);
        Player player2 = new Player("Bob", Symbol.X);
        Board board = new Board();
        Play play = new Play(player1, player2);
        play.play();
    }
}
