import java.util.ArrayList;
import java.util.List;

public class LC_52NQueens2 {
    static  int count;
    public static void main(String[] args) {
            int n = 4;
            int ans=solveNQueens(n);
            System.out.println(ans);
    }

    public static int solveNQueens(int n) {
            char board[][]=new char[n][n];
            int count=0;
            count=solve(0,board,n);
            return count;
    }

    public static int solve(int row, char[][] board, int n){
            if(row==n){
                return 1;
            }
            int count=0;
            for(int col=0;col<n;col++){
                if(isSafe(board,row,col,n)){
                    board[row][col]='Q';
                    count+=solve(row+1,board,n);
                    board[row][col]='.';
                }
            }
      return count;
    }

    public static  boolean isSafe(char[][] board,int row,int col,int n){
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }
            // Check for a queen in the upper-left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            // Check for a queen in the upper-right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            return true;

    }
}
