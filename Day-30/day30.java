public class day30 {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if(n % 2 == 0) {
            return isPowerOfTwo(n/2);
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
}