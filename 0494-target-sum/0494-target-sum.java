class Solution {
    // int count =0;
    public int helper(int i,int sum,int target, int[]nums,Integer[][]dp){
        if(i==nums.length){
            if(sum==target){
             return 1;  
            }         
            else return  0;
        }
        if(dp[i][sum+total]!=null)return dp[i][sum+total];

        int sub = helper(i+1,sum-nums[i],target, nums,dp);
        int add = helper(i+1,sum+nums[i],target, nums,dp);
        return dp[i][sum+total] = add+sub;
    }
    int total ;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
         total = Arrays.stream(nums).sum();
        Integer[][]dp = new Integer[n][2*total+1];
        return helper(0,0,target,nums,dp);
    }
}