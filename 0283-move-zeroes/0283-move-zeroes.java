class Solution {
    
    public void moveZeroes(int[] nums) {
        int i=0; 
        int j=1;
        
        while(j<nums.length){
            if(nums[i]==0&&nums[j]==0){
                j++;
            }
            else if(nums[i]==0&&nums[j]!=0){
                // swap(arr[i], arr[j]);
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
                // System.out.println(i);
            }
            else if(nums[i]!=0&&nums[j]!=0){
                i++;
                j++;
                
            }else{
                i++;
                j++;
            }
            
            
        }
    }
}