class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int i=0;
        
        int k=0;
        while(k<n){
            arr[i] = nums[k];
            arr[i+1] = nums[n+k];
            i+=2;
            k++;
        }
        return arr;
        
    }
}