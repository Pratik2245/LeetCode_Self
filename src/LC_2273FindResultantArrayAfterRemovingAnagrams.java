import java.util.ArrayList;
import java.util.List;

public class LC_2273FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String s[]={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(s));
    }
    public static List<String> removeAnagrams(String[] words) {
       List<String> result=new ArrayList<>();
       String prevSignature="";
       for(String word:words){
           int freq[]=new int[26];
           for(int i=0;i<word.length();i++){
               freq[word.charAt(i)-'a']++;
           }
           StringBuilder sb = new StringBuilder();
           for (int count : freq) {
               sb.append(count).append('#'); // delimiter to separate counts
           }
           System.out.println(sb);
           String signature = sb.toString();
           if (!signature.equals(prevSignature)) {
               result.add(word);
               prevSignature = signature;
           }

       }
       return result;
    }

}
