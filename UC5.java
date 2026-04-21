
public class UC5{
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    public static void main(String[] args) {
        // Test: Row 1, Col 1 (Center)
        System.out.println("Is move (1,1) valid? " + isValidMove(1, 1));
    }
    static boolean isValidMove(int row, int col) {
        boolean withinBounds = (row >= 0 && row <= 2) && (col >= 0 && col <= 2);
        if (!withinBounds) {
            return false;
        }
        return board[row][col] == '-';
    }
}