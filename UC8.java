import java.util.Random;
import java.util.Scanner;

public class UC8{

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

    public static boolean checkWin(char s) {
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if(board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }
        if(board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;
        if(board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;
        return false;
    }

    public static boolean isDraw() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        initializeBoard();

        boolean gameOver = false;
        char currentPlayer = 'X';

        while(!gameOver) {

            displayBoard();

            if(currentPlayer == 'X') {
                int row = sc.nextInt();
                int col = sc.nextInt();
                if(!placeMove(row, col, 'X')) continue;
            } else {
                computerMove();
            }

            if(checkWin(currentPlayer)) {
                displayBoard();
                System.out.println(currentPlayer + " wins");
                gameOver = true;
            } else if(isDraw()) {
                displayBoard();
                System.out.println("Draw");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
}
