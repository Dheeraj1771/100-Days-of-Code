//Day8/100: LeetCode: 2441: Largest Positive Integer That Exists With Its Negative
public class day8 {
    public static int findMaxK(int[] nums) {
        int maxk = -1;
        for(int i=0; i<nums.length; i++) {
            if(maxk<Math.abs(nums[i])) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] == -nums[i]) {
                        maxk = Math.max(maxk, Math.abs(nums[i]));
                    } 
                }
            }
        }
        return maxk;  
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,-3,-2};
        int ans = findMaxK(arr);
        System.out.println(ans);
    }
}
