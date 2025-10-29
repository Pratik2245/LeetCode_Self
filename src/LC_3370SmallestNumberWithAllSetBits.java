public class LC_3370SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        int ans=smallestNumber(5);
        System.out.println(ans);
    }
    public static  int smallestNumber(int n) {
        int x=1;
        while(x<n){
            x=(x<<1)|1;
            System.out.println(x);
        }
        return x;
    }
}
