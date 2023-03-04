class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);
        for(int i=0; i<n; i++){
            for(int p=0;p<i; p++){
                if(nums[p]<nums[i]&&1+dp1[p]>dp1[i]){
                    dp1[i] = 1+dp1[p];
                }
            }
        }
        
        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);
        for(int i=n-1; i>=0; i--){
            for(int p=n-1;p>i; p--){
                if(nums[p]<nums[i]&&1+dp2[p]>dp2[i]){
                    dp2[i] = 1+dp2[p];
                }
            }
        }
        
        int maxi = 0;
        for(int i=0; i<n; i++){
            if(dp1[i] > 1 && dp2[i] > 1) maxi = Math.max(maxi,dp1[i]+dp2[i]-1);
        }
        System.out.println(maxi);
        return (n-maxi);
    }
}