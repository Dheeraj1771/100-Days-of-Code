public class day86 {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int i[] : accounts) {
            int currwealth = 0;
            for(int j=0; j<i.length; j++) {
                currwealth += i[j];
                maxwealth = Math.max(currwealth, maxwealth);
            }
        }
        return maxwealth;
    }
}