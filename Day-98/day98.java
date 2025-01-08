//Day98/100: LeetCode 1389. Create Target Array in the Given Order
import java.util.*;
public class day98 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        int target[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
           targetList.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++) {
            target[i] = targetList.get(i);
        }
        return target;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {0,1,2,3,4};
        int index[] = new int[] {0,1,2,2,1};
        int ans[] = createTargetArray(nums, index);
        System.out.print("[ ");
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}