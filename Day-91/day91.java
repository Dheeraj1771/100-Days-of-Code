public class day91 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++) {
            int min = nums[0];
            int x = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    x = j;
                } 
            }
            nums[x] = min * multiplier;
        }
        return nums;
    }
}