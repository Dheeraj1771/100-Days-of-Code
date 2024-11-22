//Day51/100: LeetCode: 219. Contains Duplicate II
import java.util.*;
public class day51 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(val) && i - map.get(val) <= k) {
                return true;
            } else {
                map.put(val, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}