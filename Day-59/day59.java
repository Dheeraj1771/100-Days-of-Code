//Day59/100: LeetCode: 3340. Check Balanced String
public class day59 {
    public static boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        char arr[] = num.toCharArray();
        for(int i=0; i<arr.length; i+=2) {
            even += Character.getNumericValue(arr[i]);
        }
        for(int j=1; j<arr.length; j+=2) {
            odd += Character.getNumericValue(arr[j]); 
        }
        if(odd == even) return true;
        else return false;
    }
    public static void main(String[] args) {
       boolean ans = isBalanced(num); 
    }
}
