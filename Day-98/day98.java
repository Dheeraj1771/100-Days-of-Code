public class day98 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        int target[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
           targetList.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++) {
            target[i] = targetList.get(i);
        }
        return target;
    }
}