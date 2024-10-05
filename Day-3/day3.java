//Day3/100: Leetcode: 9. Palindrome Number
public class day3 {
    class Solution {
        public static boolean isPalindrome(int x) {
            int temp = x;
            int rem = 0;
            int rev = 0;
            if (x == 0) {
                return true;
            }
            if (x < 0) {
                return false;
            }
            else {
                while(x > 0) {
                    rem = x % 10;
                    rev = (rev * 10) + rem;
                    x = x/10; 
                }
                if (temp == rev) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        public static void main(String[] args) {
            boolean ans = isPalindrome(101);
            System.out.println(ans);
        }
    }
}