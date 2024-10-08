//Day2/100: LeetCode: 1929. Concatenation of Array
public class day2 {
    public static int[] getConcatenation(int[] nums) {
        int result[] = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3};
        int ans[] = getConcatenation(nums);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
