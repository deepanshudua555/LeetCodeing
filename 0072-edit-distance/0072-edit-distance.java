class Solution {
    
    public int f(int i,int j,String  str1,String str2,Integer[][]dp){
        if(i==0)return j;
        if(j==0)return i;
        if(dp[i][j]!=null)return dp[i][j];
        if(str1.charAt(i-1)==str2.charAt(j-1))return dp[i][j] = f(i-1,j-1,str1,str2,dp);
        return dp[i][j] = 1+Math.min(f(i,j-1,str1,str2,dp),Math.min(f(i-1 ,j,str1,str2,dp),f(i-1,j-1,str1,str2,dp)));
    }
    
    public int minDistance(String str1, String str2) {
        int n  = str1.length();
        int m = str2.length();
        Integer[][]dp = new Integer[n+1][m+1];
        for(int i=0; i<=n; i++)dp[i][0] = i;
        for(int j=0; j<=m; j++)dp[0][j] = j;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))dp[i][j] = dp[i-1][j-1];
                else{
                  dp[i][j] = 1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));  
                }
            }
        }
        return dp[n][m];
        
    }
}