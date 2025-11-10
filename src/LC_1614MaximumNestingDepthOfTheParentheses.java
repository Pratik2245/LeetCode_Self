import java.util.Map;

public class LC_1614MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count=count+1;
                max= Math.max(max,count);
            }else if(s.charAt(i)==')'){
                count=count-1;
            }
        }
        return max;
    }
}
