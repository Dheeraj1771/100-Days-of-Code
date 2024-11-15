//Day44/100: LeetCode: 1470. Shuffle the Array
public class day44 {
    public int[] shuffle(int[] nums, int n) {
        int suffled[] = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length/2; i++) {
            suffled[k] = nums[i];
            suffled[k+1] = nums[n+i];
            k=k+2;
        }
        return suffled;
    }
}