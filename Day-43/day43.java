//Day43/100: LeetCode: 1720. Decode XORed Array
import java.util.*;
public class day43 {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i != nums[i]) {
                return i;
            }
        }
        return nums[nums.length-1] + 1;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
