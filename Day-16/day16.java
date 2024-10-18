//Day16/100: LeetCode: 33. Search in Rotated Sorted Array
public class day16 {
    class Solution {
        public static int search(int[] nums, int target) {
            int n = nums.length;
            int low = 0;
            int high = n - 1;
            while(low <= high) {
                int mid = (low + high)/2;
                if (nums[mid] == target) {
                    return mid;
                }
                //left side sorted 
                if(nums[low] <= nums[mid]) {
                    if(nums[low] <= target && target <= nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    // Right side sorted 
                    if(nums[mid] <= target && target <= nums[high]) {
                        low = mid + 1;
                    }  else {
                        high = mid - 1;
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int nums[] = new int[] {6,7,8,1,2,3,4,5};
            int target = 3;
            int ans = search(nums, target);
            System.out.println(ans);
        }
    }
}
