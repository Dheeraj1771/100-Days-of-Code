//Day85/100: LeetCode 3190. Find Minimum Operations to Make All Elements Divisible by Three
public class day85 {
    public static int minimumOperations(int[] nums) {
        int op = 0;
        for(int i: nums) {
            if(i%3 == 1 || i%3 == 2) {
                op++;
            }
        }
        return op;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,4};
        int ans = minimumOperations(nums);
        System.out.println(ans);
    }
}