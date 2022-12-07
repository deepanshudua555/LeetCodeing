class Solution {
    
    
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
       
       int  dpnm1= 1;
       int dpnm2 = 1;
        int dpi = 0;
        for(int i=2; i<=n; i++){
            dpi  = dpnm1+dpnm2;
            dpnm2 = dpnm1;
            dpnm1 = dpi;
        }
        return dpi;
    }
} 