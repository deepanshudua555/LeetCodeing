class Solution {
    public static int f(int i, int j, int[] newCuts, Integer dp[][]){
        
        if(i>j)return 0;
        if(dp[i][j]!=null)return dp[i][j];
        int mini = Integer.MAX_VALUE;
        for(int ind=i; ind<=j; ind++){
            int cost = newCuts[j+1]-newCuts[i-1]+f(i,ind-1,newCuts,dp)+f(ind+1,j,newCuts,dp);
            mini = Math.min(mini,cost);
        }
        return dp[i][j] = mini;
    }
    
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int newCuts[] = new int[m + 2];
        System.arraycopy(cuts, 0, newCuts, 1, m);
        newCuts[m + 1] = n;
        Arrays.sort(newCuts);
        Integer dp[][] = new Integer[m+2][m+2];
        return f(1,cuts.length,newCuts,dp);
    }
}