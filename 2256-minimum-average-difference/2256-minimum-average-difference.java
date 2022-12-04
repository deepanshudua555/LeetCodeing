class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        
        long sum = 0;
        for(int i=0; i<n; i++){
            // if(nums[i]==0)return i;
            sum+=nums[i];
        }
        // if(sum==0)return 0;
        long ans = Long.MAX_VALUE;
        int idx = 0;
        long add = 0;
        long divider1 = 1;
        long divider2  = n-1;
        for(int i=0; i<n; i++){
            add+=nums[i];
            long n1 = add/(divider1);
            long n2=0;
            if(divider2!=0){
                n2 = (sum-add)/divider2;    
            }
            
            divider1++;
            divider2--;
            long pa = Math.abs(n1-n2);
            if(pa<ans){
                ans = pa;
                idx = i;
            }
            
        }
        
        // if((sum/n)<=ans)return n-1;
        return idx;
    }
}