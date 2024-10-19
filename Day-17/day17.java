
public class day17 {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while(temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        if(x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int x = 12;
        int ans = sumOfTheDigitsOfHarshadNumber(x);
        System.out.println(ans);
    } 
}
