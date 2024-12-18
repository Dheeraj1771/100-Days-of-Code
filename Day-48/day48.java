//Day48/100: LeetCode: 3151. Special Array I
public class day48 {
    public static boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0) return false;
            if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0) return false;   
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {2,1,4};
        boolean ans = isArraySpecial(nums);
        System.out.println(ans);
    }
}