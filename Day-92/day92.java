//Day92/100: LeetCode 2824. Count Pairs Whose Sum is Less than Target
import java.util.*;
public class day92 {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0; i<nums.size()-1; i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target =  2;
        int ans = countPairs(nums, target);
        System.out.println(ans);
    }
}