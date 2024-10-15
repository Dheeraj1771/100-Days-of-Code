
public class day13 {
    public static int mySqrt(int x) {
        int low = 0;  
        int high = x; 
        if (x == 0 || x == 1) {
            return x;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;  
            long val = (long) mid * mid;  
            if (val == x) {
                return mid;  
            } else if (val < x) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int x = 28;
        int ans = mySqrt(x);
        System.out.println(ans);
        
    }
}
