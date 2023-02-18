class Solution {
    public int maxProfit(int[] p) {
         int mini = p[0];
        int profit = 0;
        int n = p.length;
        for(int i=1;i<n; i++){
            int profit_on_particular_day = p[i]-mini;
             profit = Math.max(profit, profit_on_particular_day);
            mini = Math.min(mini,p[i]);
        }
        return profit;
    }
}