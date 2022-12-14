class Solution {
    
    // public int f(int i,int j,String  str1,String str2,Integer[][]dp){
    //     if(i==0)return j;
    //     if(j==0)return i;
    //     if(dp[i][j]!=null)return dp[i][j];
    //     if(str1.charAt(i-1)==str2.charAt(j-1))return dp[i][j] = f(i-1,j-1,str1,str2,dp);
    //     return dp[i][j] = 1+Math.min(f(i,j-1,str1,str2,dp),Math.min(f(i-1 ,j,str1,str2,dp),f(i-1,j-1,str1,str2,dp)));
    // }
    
    public int minDistance(String str1, String str2) {
        if(str1.equals("") || str2.equals(""))return str2.length()>str1.length()?str2.length():str1.length();
        int n  = str1.length();
        int m = str2.length();
        Integer[]prev = new Integer[m+1];
        Integer[]curr = new Integer[m+1];
        for(int j=0; j<=m; j++)prev[j] = j;
        
        for(int i=1; i<=n; i++){
            curr[0] = i;
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))curr[j] = prev[j-1];
                else{
                  curr[j] = 1+Math.min(curr[j-1],Math.min(prev[j],prev[j-1]));  
                }
            }
            prev = (Integer[])(curr.clone());
        }
        return curr[m];
        
    }
}