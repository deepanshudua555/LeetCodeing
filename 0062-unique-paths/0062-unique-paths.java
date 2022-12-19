class Solution {
    // public int uh(int i, int j,int[][]dp){
    //     if(i==0&&j==0){
    //         return 1;
    //     }    
    //     if(i<0||j<0)return 0;  
    //     if(dp[i][j]!=0){
    //         return dp[i][j];
    //     }
    //     int up = uh(i-1,j,dp);
    //     int left = uh(i,j-1,dp);
    //     return dp[i][j] = up +left; 
    // }    
    
    public int uniquePaths(int i, int j) {
        int[] prev = new int[j];
        for(int ii=0; ii<i; ii++){
            int [] curr = new int[j];
            for(int jj=0; jj<j; jj++){
                if(ii==0&&jj==0)curr[jj]=1;
                else{
                    int up = 0;
                    int left = 0;
                    if(ii>0)up = prev[jj];
                    if(jj>0)left = curr[jj-1];
                    curr[jj] = up+left;
                }

            }
            prev = curr;
        }
        return prev[j-1];
    }
}