//Day84/100: LeetCode 3289. The Two Sneaky Numbers of Digitville
import java.util.*;
public class day84 {
    public static int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                arr[j] = i;
                j++;
            } else {
                set.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {0,1,1,0};
        int ans [] = getSneakyNumbers(nums);
        System.out.print("[ ");
        for(int i : ans) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}