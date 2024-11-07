public class day36 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum = 0;
        for(int i=0; i<nums.length; i+=2) {
            maxsum += nums[i];
        }
        return maxsum;
    }
}