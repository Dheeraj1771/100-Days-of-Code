//Day47/100: LeetCode: 414. Third Maximum Number
import java.util.*;
public class day47 {
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int element : nums) {
            set.add(element);
        }
        int arr[] = new int[set.size()];
        int i = 0;
        for(int ele : set){ 
          arr[i++] = ele; 
        } 
        Arrays.sort(arr);
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return Math.max(arr[0], arr[1]);
        int ind = arr.length;
        return arr[ind - 3];
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,1,2};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
}