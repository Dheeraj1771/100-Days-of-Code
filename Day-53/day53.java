//Day53/100: LeetCode: 509. Fibonacci Number
public class day53 {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
         for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}