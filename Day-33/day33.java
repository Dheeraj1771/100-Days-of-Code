//Day33/100: LeetCode: 215. Kth Largest Element in an Array
import java.util.*;
public class day33 {
    public static int findKthLargest(int[] nums, int k) {
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
    public static void main(String[] args) {
        int nums[] = new int[] {3,2,1,5,6,4};
        int k = 2;
        int ans = findKthLargest(nums, k);
        System.out.println(ans);
    }
}