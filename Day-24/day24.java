//Day24/100: LeetCode: 908. Smallest Range I
public class day24 {
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if(min + k >= max - k) {
            return 0;
        } else {
            return ((max - k) - (min + k));
        }
    }  
    public static void main(String[] args) {
        int nums[] = new int[] {0,10};
        int k = 2;
        int ans = smallestRangeI(nums, k);
        System.out.println(ans);


    }  
}
