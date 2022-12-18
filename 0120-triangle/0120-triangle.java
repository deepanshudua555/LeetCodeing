class Solution {
    
    // public int mTh(int n,int i,int j,List<List<Integer>> triangle,int[][]dp ){
    //     if(i==n-1)return triangle.get(n-1).get(j);
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int down = triangle.get(i).get(j)+mTh(n,i+1,j,triangle,dp);
    //     int diag = triangle.get(i).get(j)+mTh(n,i+1,j+1,triangle,dp);
    //     return dp[i][j] =  Math.min(down,diag);
    // } 
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n =  triangle.size();
        // int[][]dp = new int[n][n];
        int[] front = new int[n];
        
        for(int j=0; j<n; j++){
            front[j] = triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            int[] curr = new int[n];
            for(int j=i; j>=0;j--){
                int down = triangle.get(i).get(j)+front[j];
                int diag = triangle.get(i).get(j)+front[j+1];
                curr[j] = Math.min(down,diag);
            }
            front = curr;
        }
        return front[0];  
    }
}