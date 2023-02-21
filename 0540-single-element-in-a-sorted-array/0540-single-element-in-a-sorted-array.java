class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
           int mid = low+(high-low)/2;
            if(mid%2==0&&mid+1<n&&nums[mid]==nums[mid+1]||
              (mid%2==1&&mid-1>=0&&nums[mid]==nums[mid-1]))low = mid+1;
            else high = mid-1;
            
            if(mid-1>0&&mid+1<n && nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1])return nums[mid];
            
        }
        return nums[low];
    }
}