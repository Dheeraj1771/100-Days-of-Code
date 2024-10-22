//Day20/100: LeetCode: 367. Valid Perfect Square
import java.util.Arrays;
public class day20 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,2,3,4,1,1,2,2,2,2,3,2};
    }
}