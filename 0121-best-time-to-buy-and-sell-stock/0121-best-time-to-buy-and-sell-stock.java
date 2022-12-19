class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit = 0;
        int buy = prices[0];
        int profit_max=0;
        for(int i=1; i<prices.length; i++){
            buy = Math.min(buy, prices[i]);
            profit_max = Math.max(profit_max, prices[i]-buy);
        }
        return profit_max;
    }
}