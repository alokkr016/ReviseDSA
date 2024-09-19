package alok.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
           int finalTarget = target - nums[i];
           if(map.containsKey(finalTarget) && map.get(finalTarget) != i){
               return new int[]{i, map.get(finalTarget)};
           }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
