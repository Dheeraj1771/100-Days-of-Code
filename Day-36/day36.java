//Day36/100: LeetCode: 561. Array Partition
import java.util.*;
public class day36 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum = 0;
        for(int i=0; i<nums.length; i+=2) {
            maxsum += nums[i];
        }
        return maxsum;
    }
    public static void main(String[] args) {
        
    }
}