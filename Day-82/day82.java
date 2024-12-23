//Day81/100: LeetCode 1920. Build Array from Permutation
public class day82 {
    public static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int a = nums[i];
            ans[i] = nums[a];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {0,2,1,5,3,4};
        int res[] = buildArray(nums);
        System.out.print("[ ");
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.print("]");
    }
}