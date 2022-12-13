class Solution {
    
//     public int mfpsh(int i, int j, int[][]matrix,int[][]dp){
//         if(j<0 || j>=matrix[0].length)return (int)1e9;
//         if(i==0)return matrix[0][j];
//         if(dp[i][j]!=0)return dp[i][j];
//         int s = matrix[i][j]+mfpsh(i-1,j,matrix,dp);
//         int ld= matrix[i][j]+mfpsh(i-1,j-1,matrix,dp);
//         int rd= matrix[i][j]+mfpsh(i-1,j+1,matrix,dp);
//         return dp[i][j] = Math.min(s,Math.min(ld,rd));
        
//     }
    
    public int minFallingPathSum(int[][] matrix) {
         int n = matrix.length;         
         int m = matrix[0].length;

        int[]prev = new int[m];
        for(int j=0; j<m; j++){
            // int ans = mfpsh(n-1, j, matrix,dp);
            // mini = Math.min(mini,ans);
            prev[j] = matrix[0][j];
        }
        
        for(int i=1; i<n; i++){
            int ld = Integer.MAX_VALUE;
            int rd = Integer.MAX_VALUE;
            int[]temp= new int[m];
            for(int j=0; j<m; j++){
                
                int s = matrix[i][j]+prev[j];
                if(j>0) ld= matrix[i][j]+prev[j-1];
                if(j+1<m)rd= matrix[i][j]+prev[j+1];
                temp[j] = Math.min(s,Math.min(ld,rd));
            }
            prev = temp;
        }
        int mini = prev[0];
        for(int j=0; j<m; j++){
            mini = Math.min(mini,prev[j]);
        }
        return mini;
    }
}