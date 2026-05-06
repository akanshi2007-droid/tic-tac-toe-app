public class UC10 {

    static char[][] board = {
        {'X','O','X'},
        {'O','X','O'},
        {'X','O','X'}
    };

    public static boolean isDraw() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDraw());
    }
}