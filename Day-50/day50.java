//Day50/100: LeetCode: 1480. Running Sum of 1d Array
public class day50 {
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,4};
        int ans[] = runningSum(nums);
        System.out.print("[ ");
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}