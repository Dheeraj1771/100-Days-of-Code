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
    public static void main(String[] args) {
        int nums[] = new int[] {2,1,3,5,6};
        int k = 5;
    }
}