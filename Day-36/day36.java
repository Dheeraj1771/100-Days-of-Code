//Day36/100: LeetCode: 561. Array Partition
import java.util.*;
public class day36 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum = 0;
        for(int i=0; i<nums.length; i+=2) {
            maxsum += nums[i];
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {6,2,6,5,1,2};
        int ans = arrayPairSum(nums);
    }
}