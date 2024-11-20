//Day49/100: LeetCode: 3131. Find the Integer Added to Array I
public class day49 {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<nums1.length; i++) {
            max1 = Math.max(max1, nums1[i]);
            max2 = Math.max(max2, nums2[i]);
        }
        return max2 - max1;
    }
    public static void main(String[] args) {
        int nums1[] = new int[] {2,6,4};
        
    }
}