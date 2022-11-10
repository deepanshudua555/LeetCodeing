class Solution {
    
    public int helper(int i, int target, int[]coins,Integer[][]dp){
        if(i==0){
            if(target%coins[0]==0){
                return 1;
            }
            else return 0;
        }
        if(dp[i][target]!=null)return dp[i][target];
        int nonpick = helper(i-1, target, coins,dp);
        int pick = 0;
        if(coins[i]<=target){
            pick = helper(i, target-coins[i],coins,dp);
        }
        return dp[i][target] = nonpick+pick;
    }
    
    public int change(int amount, int[]coins) {
        int n = coins.length;
        Integer[][]dp = new Integer[n][amount+1];
        return helper(n-1,amount, coins,dp);
    }
}