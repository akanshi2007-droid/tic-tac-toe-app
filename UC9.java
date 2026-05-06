public class UC9 {

    static char[][] board = {
        {'X','O','X'},
        {'O','X','O'},
        {'X','-','O'}
    };

    public static boolean checkWin(char s) {

        for(int i = 0; i < 3; i++) {
            if(board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if(board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }

        if(board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;

        if(board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkWin('X'));
    }
}