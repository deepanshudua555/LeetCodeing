class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        
        int dpnm2= 0;
        int dpnm1 = 1;
        int dpi = 0;
        for(int i=2; i<=n; i++){
            dpi = dpnm2+dpnm1;
            dpnm2 = dpnm1;
            dpnm1 = dpi;
            
        }
        return dpnm1;
    }
}