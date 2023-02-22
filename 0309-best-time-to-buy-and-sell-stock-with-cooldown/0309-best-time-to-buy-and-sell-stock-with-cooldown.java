class Solution {
    
    public int f(int ind, int buy,int[]p, int n,Integer[][]dp){
        if(ind>=n){
            return 0;
        }
        int profit = 0;
        if(dp[ind][buy]!=null)return dp[ind][buy];
        if(buy==1){
            profit = Math.max(-p[ind]+f(ind+1,0,p,n,dp), 0+f(ind+1,1,p,n,dp));
        }
        else{
            profit = Math.max(p[ind]+f(ind+2,1,p,n,dp), 0+f(ind+1,0,p,n,dp));
        }
        return dp[ind][buy] = profit;
    }
    
    public int maxProfit(int[] prices) {
        int n = prices.length;    
        Integer[][]dp = new Integer[n][2];
        return f(0,1,prices,n,dp);
    }
}