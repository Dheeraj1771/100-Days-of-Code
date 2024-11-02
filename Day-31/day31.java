//Day31/100: LeetCode: 342. 338. Counting Bits
public class day31 {
    public static int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 12;
        int ans[] = new int[n + 1];
        ans = countBits(n);
        System.out.println("[ ");
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
        System.out.println("]");
    }
}
