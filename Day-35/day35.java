//Day35/100: LeetCode: 896. Monotonic Array
public class day35 {
    public static boolean isMonotonic(int[] nums) {
        boolean MonotonicInc = true;
        boolean MonotonicDes = true;

        for(int i=1; i<nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                MonotonicDes = false;
            }
            if(nums[i - 1] > nums[i]) {
                MonotonicInc = false;
            }
        }
        return MonotonicInc || MonotonicDes;
    }
    public static void main(String[] args) {
        
    }
}