public class LC_14LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix= new StringBuilder("");
        for(int i=1;i<strs.length;i++){
            int j=0;
             while (j<strs[i].length() || j<strs[i-1].length()){
                if(strs[i].charAt(j)==strs[i-1].charAt(j)){
                    prefix.append(strs[i].charAt(j));
                }
                j++;
             }
        }
        return prefix.toString();
    }
}
