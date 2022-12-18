class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n < 0) return false;  
        if(n == 0) return false; 
        if(n == 1) return true;                         
           
        long i = 1;
        while( i < n )                                  
        {
            i = i * 2;
                      
        }
        if( i == n ) return true;
        else return false;
    }
}