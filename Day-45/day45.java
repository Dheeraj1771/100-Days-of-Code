public class day45 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for(int i=0; i<arr1.length; i++) {
            for(int j =0; j<arr2.length; j++) {
                int sub = arr1[i] - arr2[j];
                if(Math.abs(sub) <= d) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = new int[] {4,5,8};
        int arr2[] = new int[] {10,9,1,8};
        int d = 2;
        int ans = findTheDistanceValue(arr1, arr2, d);
        
    }
}