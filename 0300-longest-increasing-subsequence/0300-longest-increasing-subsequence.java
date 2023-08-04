class Solution {
    public int f(int idx,int prev, int[] nums,Integer dp[][]){
        if( idx==nums.length)return 0;
        if(dp[idx][prev+1]!=null)return dp[idx][prev+1];
        int notTake = f(idx+1, prev, nums,dp);
        int take = (int)(-1e9);
        
        if(prev==-1 || nums[idx]>nums[prev]){
            take = 1+f(idx+1, idx, nums,dp);
        }
        return dp[idx][prev+1] =  Math.max(take, notTake);
    } 
    
    
    public int lengthOfLIS(int[] nums) {
            Integer dp[][] = new Integer[nums.length][nums.length+1];
        return f(0, -1, nums,dp);
    }
}