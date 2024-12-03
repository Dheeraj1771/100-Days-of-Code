public class day62 {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {7,1,14,11};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
}