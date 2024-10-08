//Day1/100: LeetCode: 217. Contains Duplicate
import java.util.*;
class day1 {
    public static boolean containsDuplicate(int[] nums) {
        //Sorting 
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1; i<n; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;   
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,2,4,5};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
        
    }
}