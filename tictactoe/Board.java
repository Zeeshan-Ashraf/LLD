package tictactoe;

public class Board {
    private Cell[][] board;
    private Status status;

    public Board() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Cell();
            }
        }
        status = Status.UNDECIDED;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Status getStatus() {
        return status;
    }

    public void reset() {
        board = new Cell[9][9];
    }

    public Player move(int row, int col, Player player) throws IllegalArgumentException {
        if (board[row][col].getPlayer() != null) {
            throw new IllegalArgumentException("This cell is already occupied");
        }
        else if (row >= 3 || col >= 3 || row < 0 || col < 0) {
            throw new IllegalArgumentException("row or col out of bounds");
        }
        Cell cell = new Cell();
        cell.setPlayer(player);
        board[row][col] = cell;
        return getWinner();
    }

    public Player getWinner() {
        for (Cell[] row : board) {
            if (row[0].getPlayer() != null && row[1].getPlayer() != null && row[2].getPlayer() != null) {
                if (row[0].getPlayer() == row[1].getPlayer() && row[0].getPlayer() == row[2].getPlayer()) {
                    status = Status.WIN;
                    return row[0].getPlayer();
                }
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col].getPlayer() != null && board[1][col].getPlayer() != null && board[2][col].getPlayer() != null) {
                if (board[0][col].getPlayer() == board[1][col].getPlayer() && board[1][col].getPlayer() == board[2][col].getPlayer()) {
                    status = Status.WIN;
                    return board[0][col].getPlayer();
                }
            }
        }


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].getPlayer() == null) {
                    status = Status.UNDECIDED;
                    return null;
                }
            }
        }

        status = Status.DRAW;
        return null;
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].getPlayer() == null)
                    System.out.print("| ");
                else
                    System.out.print("|"+board[row][col].getPlayer().getSymbol());
            }
            System.out.println("|");
        }
    }
}
