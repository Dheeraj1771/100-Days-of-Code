//Day19/100: LeetCode: 367. Valid Perfect Square
public class day19 {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        int start = 2;
        int end = num/2;
        while(start <= end) {
            int mid = (start + end)/2;
            if (mid == num/mid && num % mid == 0){
                return true;
            }
            else if(mid < num/mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}