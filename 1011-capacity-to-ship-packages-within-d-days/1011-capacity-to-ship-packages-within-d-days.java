class Solution {
    public int shipWithinDays(int[] w, int days) {
        int sum=0;
        int max= 0;
        for(int i=0; i<w.length; i++){
            if(w[i]>max)max = w[i];
            sum+=w[i];
        }
        
        int low = max;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(fnc(mid,w,days)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    
    public boolean fnc(int mid, int[] w, int D){
        int sum=0;
        int days = 1;
        for(int i=0; i<w.length; i++){
            if(sum+w[i]<=mid)sum+=w[i];
            else{
                sum = w[i];
                days++;
            }
        }
        if(days<=D)return true;
        return false;
    }
}