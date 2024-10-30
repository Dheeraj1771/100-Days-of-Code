//Day28/100: LeetCode: 342. Power of Four
public class day28 {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        } 
        if(n == 1) {
            return true;
        }
        if(n % 4 == 0) {
            return isPowerOfFour(n/4);
        }
        return false;
    } 
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerOfFour(n);
        System.out.println(ans);
    }
}
