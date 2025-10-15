import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_51NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = new ArrayList<>();
        result=solveNQueens(n);
        System.out.println(result);
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> mainList=new ArrayList<>();
        char board[][]=new char[n][n];
        // initialize board with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        solve(0,board,mainList,n);
        return mainList;
    }
    public static void solve(int row,char[][] board,List<List<String>> result,int n){
        if(row==n){
            result.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                solve(row+1,board,result,n);
                board[row][col]='.';
            }
        }
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
    public static List<String> construct(char[][] board){
        List<String> s=new ArrayList<>();
        for(char[] row:board){
//            System.out.println("row"+Arrays.toString(row));
            s.add(new String(row));
        }
        return s;
    }
}
