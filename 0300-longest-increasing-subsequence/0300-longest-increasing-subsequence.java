class Solution {
    
    public int f(int i, int prev, int n ,int[]nums,Integer[][] dp){
        if(i==n)return 0;
        if(dp[i][prev+1]!=null)return dp[i][prev+1];
        int notTake = 0+f(i+1,prev,n, nums,dp);
        int take = (int)-1e9;
        if(prev==-1 || nums[i]>nums[prev]){
            take = 1+f(i+1,i,n, nums,dp);
        }
         return dp[i][prev+1] = Math.max(notTake, take);
        
    }
    
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int ind = n-1;ind>=0; ind--){
            for(int pi = ind-1;pi>=-1;pi--){
                int len = 0+dp[ind+1][pi+1];
                if(pi==-1||nums[ind]>nums[pi]){
                    len = Math.max(len,1+dp[ind+1][ind+1]);
                }
                dp[ind][pi+1] = len;
            }
        }
        return dp[0][-1+1];
    }
}