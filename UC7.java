import java.util.Random;

public class UC7 {

    static char[][] board = new char[3][3];

    public static void initializeBoard() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void displayBoard() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean placeMove(int row, int col, char symbol) {
        if(row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        if(board[row][col] != '-') {
            return false;
        }

        board[row][col] = symbol;
        return true;
    }

    public static void computerMove() {
        Random rand = new Random();
        boolean movePlaced = false;

        while(!movePlaced) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            movePlaced = placeMove(row, col, 'O');
        }
    }

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        computerMove();

        displayBoard();
    }
}