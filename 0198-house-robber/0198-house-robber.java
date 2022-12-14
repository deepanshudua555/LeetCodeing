class Solution {
    
    // public int robh(int i,int[] nums,int []dp){
    //     if(i==0){
    //         return nums[i];
    //     }
    //     if(i<0)return 0;
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int pick = nums[i]+robh(i-2, nums,dp);
    //     int notPick=  robh(i-1,nums,dp);
    //     return dp[i] = Math.max(pick, notPick);
    // }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int []dp = new int[n];
        int prv = nums[0];
        int prv2=0;
        for(int i=1;i<nums.length; i++){
            int pick = nums[i];
            if(i>1) pick+=prv2; 
            int notPick=  prv;
            int curr = Math.max(pick,notPick);
            prv2=prv;
            prv = curr;
        }
        
        return prv;
    }
}