//Day39/100: LeetCode: 1281. Subtract the Product and Sum of Digits of an Integer
public class day39 {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n != 0) {
            product *= n%10;
            sum += n%10;
            n /= 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        int n = 4421;
        int ans = subtractProductAndSum(n);
    }
}