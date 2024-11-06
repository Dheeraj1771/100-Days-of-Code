public class day35 {
    public boolean isMonotonic(int[] nums) {
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
}