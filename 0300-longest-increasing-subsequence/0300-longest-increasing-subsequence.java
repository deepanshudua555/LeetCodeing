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
        Integer[][] dp = new Integer[n][n+1];
        return f(0,-1,n, nums,dp);
    }
}