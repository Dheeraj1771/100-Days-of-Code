public class day46 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max_ele = 0;
        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] > max_ele) max_ele = arr1[i];
        }
        int count[] = new int[max_ele + 1];
        for(int i=0; i<arr1.length; i++) {
            count[arr1[i]]++;
        }
        int res[] = new int[arr1.length];
        int index = 0;
        for(int i=0; i<arr2.length; i++) {
            while(count[arr2[i]] > 0) {
                res[index] = arr2[i];
                count[arr2[i]]--;
                index++;
            }
        }
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                res[index] = i;
                count[i]--;
                index++;
            }
        }
        return res;
    }
}