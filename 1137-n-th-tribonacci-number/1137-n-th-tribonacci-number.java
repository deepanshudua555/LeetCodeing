class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        
        
        int dpnm3= 0;
        int dpnm2 = 1;
        int dpnm1 = 1;
        int dpi = 0;
        for(int i=3; i<=n; i++){
            dpi = dpnm3+dpnm2+dpnm1;
            dpnm3 = dpnm2;
            dpnm2 = dpnm1;
            dpnm1 = dpi;
            
        }
        return dpnm1;
    }
}