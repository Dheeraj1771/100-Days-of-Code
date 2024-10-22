//Day20/100: LeetCode: 367. Valid Perfect Square
import java.util.Arrays;
public class day20 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        
    }
}