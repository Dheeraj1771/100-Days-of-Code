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
        
    }
}