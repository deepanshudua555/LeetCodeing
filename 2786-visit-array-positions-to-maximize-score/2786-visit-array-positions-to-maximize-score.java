class Solution {
    
    public static long  function(int i, int parity, int x, int[]nums, long[][]dp){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][parity]!=0)return dp[i][parity];
        long take  = Integer.MIN_VALUE;
        take = nums[i] + function(i+1, (nums[i]&1), x, nums,dp);
        if((nums[i]&1)!=parity){
            take-=x;
        }
        long notTake = function(i+1, parity, x, nums,dp);
        return dp[i][parity] =  Math.max(take, notTake);
    }
    
    public long maxScore(int[] nums, int x) {
        int n = nums.length;
        long dp[][] = new long [nums.length][2];
        return nums[0]+function(1, (nums[0] &1), x, nums,dp);
    }
}