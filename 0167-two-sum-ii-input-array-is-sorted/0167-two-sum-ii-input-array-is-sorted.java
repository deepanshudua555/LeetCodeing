class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        for(int i=0; i<nums.length; i++){
            int newTar = target-nums[i];
            int lo = i+1;
            int hi = nums.length-1;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(nums[mid]==newTar){
                    ans[0] = i+1;
                    ans[1]= mid+1;
                    return ans;
                }
                else{
                    if(nums[mid]>newTar)hi =mid-1;
                    else lo = mid+1;
                }
            }
        }
        return new int[]{1,2};
    }
}