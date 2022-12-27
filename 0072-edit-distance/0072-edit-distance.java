class Solution {
    
    public int f(int i,int j,String  str1,String str2,Integer[][]dp){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=null)return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j))return dp[i][j] = f(i-1,j-1,str1,str2,dp);
        return dp[i][j] = 1+Math.min(f(i,j-1,str1,str2,dp),Math.min(f(i-1 ,j,str1,str2,dp),f(i-1,j-1,str1,str2,dp)));
    }
    
    public int minDistance(String str1, String str2) {
        int n  = str1.length();
        int m = str2.length();
        Integer[][]dp = new Integer[n][m];

        return f(n-1,m-1,str1,str2,dp);
        
    }
}