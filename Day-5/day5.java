//Day5/100: Leetcode: 1. Two Sum 
import java.util.*;
public class day5 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,4,5,6,7};
        int ans[] = twoSum(nums, 9);
        System.out.print("[ ");
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}