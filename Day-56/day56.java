public class day56 {
    public static int findNumbers(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            while(nums[i] > 0) {
                count++;
                nums[i] /= 10;
            }
            if(count % 2 == 0) {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {555,901,482,1771};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
}