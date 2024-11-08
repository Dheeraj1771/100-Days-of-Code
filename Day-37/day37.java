public class day37 {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0; i<nums.length; i++) {
            currsum = currsum + nums[i];
            if(currsum > maxsum) {
                maxsum = currsum;
            }
            if(currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
}