//Day15/100: LeetCode: 70. Climbing Stairs
public class day15 {
    public static int climbStairs(int n) {
        if(n==1) {
            return 1;
        } else {
            int dp[] = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for(int i=3; i<=n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
    public static void main(String[] args) {
        int n = 8;
        int ans = climbStairs(n);
        System.out.println(ans);
    }
}
