class Solution {
    
    public void reverse(int s,int e,int[]nums){
        int i=s;
        int j=e;
        int c= (e-s)/2;
        while(c-->=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k==n||k==0 ||n==1)return;
        if(k>n)k=k%n;
        reverse(0, n-k-1,nums);
       
        reverse(n-k,n-1,nums);
       
        reverse(0,n-1,nums);
        
        
    }
}