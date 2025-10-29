public class LC_2011FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int ans=finalValueAfterOperations(operations);
        System.out.println(ans);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')  //1 index character checking
                count++;
            else
                count--;
        }
        return count;
    }
}
