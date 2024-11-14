//Day42/100: LeetCode: 1720. Decode XORed Array
public class day43 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i != nums[i]) {
                return i;
            }
        }
        return nums[nums.length-1] + 1;
    }
}
