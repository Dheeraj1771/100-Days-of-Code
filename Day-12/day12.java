//Day12/100: LeetCode: 35. Search Insert Position
public class day12 {
  public static int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length-1;
    while(start <= end) {
      int mid = (start+end)/2;
      if(nums[mid] == target) {
        return mid;
      }
      else if(nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start; 
  }
  public static void main(String[] args) {
    int nums[] = new int[] {1,2,3,6};
    int target = 5;
    int ans = searchInsert(nums, target);
    System.out.println(ans);
  } 
}
