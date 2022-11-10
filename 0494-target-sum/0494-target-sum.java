class Solution {
    // int count =0;
    public int helper(int i,int sum,int target, int[]nums){
        if(i==nums.length){
            if(sum==target){
             return 1;  
            }         
            else return 0;
        }

        int sub = helper(i+1,sum-nums[i],target, nums);
        int add = helper(i+1,sum+nums[i],target, nums);
        return add+sub;
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        // int[]dp = new int[n][target+1]
        return helper(0,0,target,nums);
    }
}