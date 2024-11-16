public class day45 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
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
    }
}