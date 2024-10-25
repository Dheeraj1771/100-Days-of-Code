//Day22/100: LeetCode: 507. Perfect Number
public class day23 {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        if(sum == num) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
    
}
