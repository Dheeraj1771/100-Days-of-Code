public class day85 {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int i: nums) {
            if(i%3 == 1 || i%3 == 2) {
                op++;
            }
        }
        return op;
    }
}