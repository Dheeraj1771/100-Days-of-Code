//Day62/100: LeetCode 1346. Check If N and Its Double Exist
public class day62 {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {-2,0,10,-19,4,6,-8};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
}