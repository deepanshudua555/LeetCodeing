class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxi = 1;
        int n = nums.length;
        int[]dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=0; i<n; i++){
            for(int p=0;p<i; p++){
                if(nums[p]<nums[i]){
                    dp[i] = Math.max(dp[i],1+dp[p]);
                }
            }
            maxi = Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}