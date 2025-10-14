public class LC_79WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        boolean ans=exist(board,word);
        System.out.println(ans);
    }
    public static boolean exist(char[][] board, String word) {
       int freq[]=new int[26];
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
               freq[Character.toUpperCase(board[i][j])-'A']++;
           }
       }
       for(int i=0;i<word.length();i++){
           if(freq[word.charAt(i)-'A']==0){
               return false;
           }else {
               freq[word.charAt(i)-'A']--;
           }
       }
       return true;
    }

}
