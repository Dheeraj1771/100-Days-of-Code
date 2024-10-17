//Day14/100: LeetCode: 728. Self Dividing Numbers
import java.util.*;
public class day14 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(left <= right) {
            int temp = left;
            while(temp > 0) {
                int digit = temp % 10;
                if(digit == 0 || left % digit != 0) {
                    count ++;
                    break;
                } else {
                    temp = temp / 10;
                }
            }
            if(count == 0) {
                list.add(left);
            } else {
                count = 0;
            }
            left++;
        }
        return list;
    }
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> ans = new ArrayList<Integer>();
        ans = selfDividingNumbers(left, right);
        System.out.println(ans);
    }
}
