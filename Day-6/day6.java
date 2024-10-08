//Day6/100: LeetCode: 121. Best Time to Buy and Sell Stock
public class day6 {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - min;
            maxprofit = Math.max(maxprofit, profit);
            min = Math.min(min, prices[i]);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = new int[] {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}