//Day33/100: LeetCode: 215. Kth Largest Element in an Array
import java.util.*;
public class day33 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            pq.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++) {
            if(pq.peek() < nums[i]) {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}