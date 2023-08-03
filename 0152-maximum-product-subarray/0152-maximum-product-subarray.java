class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pMax = 1;
        int sMax = 1;
        int ans = 0;
        if(n==1)return nums[0];
        for(int i=n-1; i>=0; i--){
            if(pMax==0)pMax = 1;
            if(sMax==0)sMax = 1;
            pMax *=nums[i];
            sMax *=nums[n-1-i];
            ans = Math.max(ans,Math.max(pMax,sMax));                
        }
        return ans;
    }
}