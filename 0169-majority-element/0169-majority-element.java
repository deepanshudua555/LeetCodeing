class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxcount = 0;
        int count = 1;
        int ans = 0;
        if(nums.length==1){
            ans=1;
        }
        for(int j=0; j<nums.length-1; j++){
             if(nums[j]==nums[j+1]){
                 count++;
                 // ans = nums[j];
             }
             else{
                 count=1;
             }
             if(count>maxcount){
                 maxcount = count;
                 ans = nums[j];
             }
        }
        // System.out.print(count);
        return ans;
    }
}