//Day22/100: LeetCode: 66. Plus One
public class day22 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int newdigits[] = new int[n+1];
        newdigits[0] = 1;
        return newdigits;
    }
    public static void main(String[] args) {
        int digits[] = new int[] {9,9,9};
        int ans[] = plusOne(digits);
        
    }
}
