public class day56 {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            while(nums[i] > 0) {
                int digit = nums[i] % 10;
                count++;
                nums[i] /= 10;
            }
            if(count % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}