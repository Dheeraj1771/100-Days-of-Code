//Day38/100: LeetCode: 349. Intersection of Two Arrays
import java.util.*;     
public class day38 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length; j++) {
            if(set1.contains(nums2[j])) {
                intersect.add(nums2[j]);
            }
        }
        int res[] = new int[intersect.size()];
        int index = 0;
        for(int k : intersect) {
            res[index++] = k;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums1[] = new int[] {4,9,5};
        int nums2[] = new int[] {9,4,9,8,4};
        int ans[] = new int[Math.min(nums1.length, nums2.length)];
        ans = intersection(nums1, nums2);
        
    }
}