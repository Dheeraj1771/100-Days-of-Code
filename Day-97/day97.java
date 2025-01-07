//Day97/100: LeetCode 2574. Left and Right Sum Differences
public class day97 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int leftsum[] = new int[n];
        leftsum[0] = 0;
        int rightsum[] = new int[n];
        rightsum[n-1] = 0;
        for(int i=1; i<n; i++) {
            leftsum[i] = leftsum[i-1] + nums[i-1];
        }
        for(int j=n-2; j>=0; j--) {
            rightsum[j] = rightsum[j+1] + nums[j+1];
        }
        for(int k=0;k<n; k++) {
            answer[k] = Math.abs(leftsum[k] - rightsum[k]); 
        }
        return answer;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {10,4,8,3};
        int ans[] = leftRightDifference(nums);
        System.out.print("[ ");
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("]");
    }
}