public class day52 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                curr += 1;
            } else {
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
    }
}