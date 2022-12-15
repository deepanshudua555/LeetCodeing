class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[]ans = new int[n];
        for(int i=0;i<n; i++){
            int j=m-1;
            int a = -1;
            while(j>=0 &&  nums2[j] != nums1[i]){
                if(nums2[j]>nums1[i])a=nums2[j];
                j--;
            }
            ans[i] = a;
        }
        return ans;
    }
}