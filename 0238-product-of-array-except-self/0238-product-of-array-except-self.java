class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[nums.length-1] = 1;
        suffix[0] = 1;
        for(int i=nums.length-2,j=1; i>=0; i--,j++){
            prefix[i] = prefix[i+1]*nums[i+1];
            
            suffix[j] = suffix[j-1]*nums[j-1];
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = prefix[i]*suffix[i];
        }
        return nums;
    }
}