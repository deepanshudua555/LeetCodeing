class Solution {
    public boolean isUgly(int n) {
        int flag=0;
        if(n==0)return false;
        while(n!=1 && flag==0){
            flag=1;
             if(n%2==0){
                 n/=2;
                 flag=0;
             }   
             if(n%3==0){
                 n/=3;
                 flag=0;
             }   
             if(n%5==0){
                 n/=5;
                 flag=0;
            }
        }
        if(n==1)return true;
        
        return false;
        
    }
}