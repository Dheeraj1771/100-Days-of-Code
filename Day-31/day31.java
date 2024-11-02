//Day31/100: LeetCode: 342. 338. Counting Bits
public class day31 {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
