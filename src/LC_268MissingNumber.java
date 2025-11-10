public class LC_268MissingNumber {
    public static void main(String[] args) {
      int nums[]={3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        
      int ans=(nums.length+nums.length+1)/2;
      return ans;
    }

}
