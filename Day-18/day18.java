//Day18/100: LeetCode: 263. Ugly Number
public class day18{
    public static boolean isUgly(int n) {
        if(n==0) {
            return false;
        } 
        if(n > 0 && n <= 3) {
            return true;
        }
        if(n % 2 == 0) {
            return isUgly(n/2);
        }
        if(n % 3 == 0) {
            return isUgly(n/3);
        }
        if(n % 5 == 0) {
            return isUgly(n/5);
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 6;
        boolean ans = isUgly(n);
        System.out.println(ans);
    }
}