class Solution {
    
    public boolean f(int i,int j, String p, String s,Boolean[][] dp){
        // System.out.println("H");
        if(i==0 && j==0)return true ;
        if(i==0 && j>0)return false;
        if(j==0 && i>0){
            for(int ii =1;ii<=i;ii++){
                if(p.charAt(ii-1)!='*')return false;
            }
            return true;
        }
        
        if(dp[i][j]!=null)return dp[i][j];
        if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i-1)=='?'){
            return dp[i][j]= f(i-1,j-1,p,s,dp);
        }
        if(p.charAt(i-1)=='*'){
            return dp[i][j] =  f(i,j-1,p,s,dp)|f(i-1,j,p,s,dp);
        }
        return dp[i][j]=false;
    }
    
    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length(); 
        Boolean[][] dp = new Boolean[n+1][m+1];
        
        return f(n,m,p,s,dp);
    }
}