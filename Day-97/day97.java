//Day97/100: LeetCode 2574. Left and Right Sum Differences
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int leftsum[] = new int[n];
        leftsum[0] = 0;
        int rightsum[] = new int[n];
        rightsum[n-1] = 0;
        for(int i=1; i<n; i++) {
            leftsum[i] = leftsum[i-1] + nums[i-1];
        }
        for(int j=n-2; j>=0; j--) {
            rightsum[j] = rightsum[j+1] + nums[j+1];
        }
        for(int k=0;k<n; k++) {
            answer[k] = Math.abs(leftsum[k] - rightsum[k]); 
        }
        return answer;
    }
}