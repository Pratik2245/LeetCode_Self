import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//this problem only has two number that are duplicate very very important
public class LC_3289TheTwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        int arr[]={7,1,5,4,3,4,6,0,9,5,8,2};
        int arr2[]=getSneakyNumbers(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] getSneakyNumbers(int[] nums) {
        // HashSet<Integer> hashSet=new HashSet<>();
        // int arr[]=new int[2];
        // int index=0;
        // for(int i=0;i<nums.length;i++){
        //     if(!hashSet.contains(nums[i])){
        //         hashSet.add(nums[i]);
        //     }else{
        //         arr[index++]=nums[i];
        //     }
        // }
        // return arr;
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result[count] = nums[i];
                    count++;
                    break;
                }
            }
        }     return result;
    }
}
