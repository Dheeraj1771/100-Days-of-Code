//Day40/100: LeetCode: 2481. Minimum Cuts to Divide a Circle
public class day40 {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n % 2 == 0) return n/2;
        return n;
    }
}
