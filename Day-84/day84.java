public class day84 {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                arr[j] = i;
                j++;
            } else {
                set.add(i);
            }
        }
        return arr;
    }
}