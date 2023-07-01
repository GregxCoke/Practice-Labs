import java.util.Arrays;

public class TicTacToe {


    private final char EMPTY = ' ';
    private final char X = 'X';
    private final char O = 'O';

    private char currentPlayer;
    private char[][] board = new char[3][3];

    public TicTacToe() {
        currentPlayer = 'X';
        board = new char[3][3];


        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';

        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';

        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';
    }

    @Override
    public  String toString(){
        String result = "";
        for(char[] row : board){
            result += Arrays.toString(row) + "\n";
        }
        return result;
    }

    public char getCurrentPlayer(){
        return currentPlayer;
    }

    private boolean someoneWonRow(){
        for(char[] row : board){
            if (row[0] != EMPTY
            && row[0] == row[1]
            && row[0] == row[2]) {
                return true;
            }
        }
        return false;
    }
    private boolean someoneWonByColumn() {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            if (board[0][columnIndex] != EMPTY
                    && board[0][columnIndex] == board[1][columnIndex]
                    && board[0][columnIndex] == board[2][columnIndex]) {
                return true;
            }
        }
        return false;
    }
    
}







