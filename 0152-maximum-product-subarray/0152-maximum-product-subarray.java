class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n; i++){
            // int j=i+1;
            int pAns = nums[i];
            for(int j= i+1; j<n; j++){
                ans = Math.max(ans,pAns);
                pAns*=nums[j];
            }
            ans = Math.max(ans,pAns);
        }
        return ans;
    }
}