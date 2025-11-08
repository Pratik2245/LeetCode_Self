import java.util.*;

public class LC_3318FindXSumOfAllKLongSubarraysI {
    public static void main(String[] args) {
        int k=2,x=2;
        int[] arr={3,8,7,8,7,5};
        int ans[]=findXSum(arr,k,x);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findXSum(int[] nums, int k, int x) {
     int arr[]=new int[nums.length-k+1];
     for(int i=0;i<=nums.length-k;i++){
         HashMap<Integer,Integer> freq=new HashMap<>();
         for(int j=i;j<i+k;j++){
             freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
         }
//         iterating for the x elements
         if(freq.size()<=x){
             int sum=0;
             for(int j=i;j<i+k;j++){
                 sum+=nums[j];
             }
             arr[i]=sum;
         }else{
             List<Map.Entry<Integer,Integer>> pairs=new ArrayList<>(freq.entrySet());
             pairs.sort((a,b)->{
                 if(!a.getValue().equals(b.getValue())){
                     return b.getValue() - a.getValue(); // higher freq first
                 }else{
                     return b.getKey() - a.getKey();     // higher value first
                 }
             });
             int curSum=0;
             for (int j = 0; j < x && j < pairs.size(); j++) {
                 Map.Entry<Integer, Integer> e = pairs.get(j);
                 curSum += e.getKey() * e.getValue();
             }
             arr[i] = curSum;
         }
         }
    return arr;
    }
}
