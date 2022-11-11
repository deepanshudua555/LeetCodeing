class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0; 
        int j=1;
        int k = 1;
        while(j<=nums.length-1){
            if(nums[i]!=nums[j]){
                k++;
            }
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        System.out.print(k);
        return k;
    }
}