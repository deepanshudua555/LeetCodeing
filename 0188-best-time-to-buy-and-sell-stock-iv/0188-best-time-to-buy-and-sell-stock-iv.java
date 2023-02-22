class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n + 1][2];
        
        for (int t = 1; t <= k; t++) {
            
            int[][] temp = new int[n + 1][2];
            
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 1; j >= 0; j--) {
                    
                    int doNothing = temp[i + 1][j];
                    int doSomething;
                    
                    if (j == 0) {
                        doSomething = temp[i + 1][1] - prices[i];
                        
                    } else {
                        doSomething = dp[i + 1][0] + prices[i];
                    }
                    
                    temp[i][j] = Math.max(doSomething, doNothing);
                }
            }
            
            dp = temp;
        }
        
        return dp[0][0];
    }
}