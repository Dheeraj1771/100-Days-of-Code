//Day37/100: LeetCode: 53. Maximum Subarray
public class day37 {
    public static int maxSubArray(int[] nums) {
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
    public static void main(String[] args) {
        int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);

    }
}