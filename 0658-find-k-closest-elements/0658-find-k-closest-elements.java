class Solution {
    

    public List<Integer> findClosestElements(int[] arr, int k, int x) {        
       List<Integer>ans = new ArrayList<>();
   
            int l=0,r=arr.length-1;
            while((r-l)>=k){
                if(x-arr[l]>arr[r]-x) l++;
                else r--;
                
                
            }
        for(int i=0;i<k;i++){
                ans.add(arr[i+l]);
                }
        return ans;
    }
}
