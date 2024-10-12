//Day9/100: LeetCode: 20. Valid Parentheses 
public class day10 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,1,2,2,3,4,4,5,5};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    
}
