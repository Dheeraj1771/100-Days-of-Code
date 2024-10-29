public class day27 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        int start = 0;
        int end = n;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(Math.pow(3,mid) == n) {
                return true;
            } else if(Math.pow(3,mid) < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}