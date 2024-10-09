//Day7/100: LeetCode: 13. Roman to Integer
import java.util.*;
public class day7 {
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        int n = s.length();
        for(int i=0; i<n; i++) {
            char ch1 = s.charAt(i);
            if(i<n-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))) {
                ans -= m.get(ch1);
            } else {
                ans += m.get(ch1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int val = romanToInt(s);
        System.out.println("The Integer Value of the Roman Number is: " + val);
    }



}