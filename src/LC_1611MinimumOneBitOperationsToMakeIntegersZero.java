public class LC_1611MinimumOneBitOperationsToMakeIntegersZero {
    public static void main(String[] args) {
      int n=3;
      int ans=minimumOneBitOperations(n);
        System.out.println(ans);
    }
    public static int minimumOneBitOperations(int n) {
        int res = 0;
        while (n > 0) {
            res ^= n;
            n >>= 1;
        }
        return res;
    }
}
