//Day25/100: LeetCode: 202. Happy Number
import java.util.*;
public class day25 {
    public static boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        while (true) {
            int sum = 0;
            while(n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n/10;
            }
            if(sum == 1) {
                return true;
            }
            n = sum;
            if(hashSet.contains(n)) {
                return false;
            }
            hashSet.add(n);
        }
    }
    public static void main(String[] args) {
        
    }
    
}
