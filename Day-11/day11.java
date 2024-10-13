//Day11/100: LeetCode: 27. Remove Element
public class day11 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {3,2,2,3};
        int val = 2;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }
}
