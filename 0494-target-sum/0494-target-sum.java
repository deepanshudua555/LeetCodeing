class Solution {
    int count =0;
    public void helper(int i,int sum,int target, int[]nums){
        if(i==nums.length){
            if(sum==target){
              count++;  
            }            
        }
        else{
            helper(i+1,sum-nums[i],target, nums);
            helper(i+1,sum+nums[i],target, nums);
        }
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        helper(0,0,target,nums);
        return count;
    }
}