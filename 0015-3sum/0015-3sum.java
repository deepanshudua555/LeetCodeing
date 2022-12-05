class Solution {
    
    public static List<List<Integer>> twoSum(int []arr, int si, int ei, int target){
        int left = si;
        int right = ei;
        List<List<Integer>> res = new ArrayList<>();
        while(left<right){
            if(left!=si&&arr[left]==arr[left-1]){
                left++;
                continue;
            }
            
            int sum = arr[left]+arr[right];
            
            if(sum==target){
                List<Integer> subres = new ArrayList<>();
                subres.add(arr[left]);
                subres.add(arr[right]);
                res.add(subres);
                left++;
                right--;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        
        if(nums.length==0||nums.length==1) return res;
        Arrays.sort(nums); 
        for(int i=0;i<=nums.length-3; i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int val1 = nums[i];
            int trg = 0-val1;
            List<List<Integer>> subres = twoSum(nums, i+1, nums.length-1, trg);
            
            for(List<Integer> list:subres){
                list.add(val1);
                res.add(list);
            }
        }
            
        return res;
    }
}