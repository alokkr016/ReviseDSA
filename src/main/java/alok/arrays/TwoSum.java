package alok.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int finalTarget = target - nums[i];
            if (map.containsKey(finalTarget) && map.get(finalTarget) != i) {
                return new int[]{i, map.get(finalTarget)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        int inputTwo[] = {-1, 0, 1, 2, -1, -4};
        int target3Some = 0;
        System.out.println(Arrays.toString(threeSum(inputTwo, target3Some)));
    }

    private static int[] threeSum(int[] arr, int target) {
        int result[] = new int[3];
        for (int i = 0; i < arr.length - 2; i++) {
            int value = target - arr[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                int complement = value - arr[j];
                if (map.containsKey(complement)) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    result[2] = complement;
                    return result;
                }
                map.put(arr[j], j);
            }


        }
        return result;
    }
}
