// class Solution {
//     public long countSubarrays(int[] nums, int k) {
        
//     }
// }
class Solution {
    public long countSubarrays(int[] nums, int k) {
         int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int left = 0, cur = 0;
        int n = nums.length;
        for(int right=0; right<n; right++){
            if(nums[right]==mx)cur++;
            
            while(cur>=k){
                if(nums[left]==mx)cur--;
                    left++;
            }
            ans+=left;
        }
        return ans;
    }
}