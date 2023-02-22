// class Solution {
//     public int maxProfit(int k, int[] prices) {
//         int n = prices.length;
//         int[][] dp = new int[n + 1][2];
        
//         for (int t = 1; t <= k; t++) {
            
//             int[][] temp = new int[n + 1][2];
            
//             for (int i = n - 1; i >= 0; i--) {
//                 for (int j = 1; j >= 0; j--) {
                    
//                     int doNothing = temp[i + 1][j];
//                     int doSomething;
                    
//                     if (j == 0) {
//                         doSomething = temp[i + 1][1] - prices[i];
                        
//                     } else {
//                         doSomething = dp[i + 1][0] + prices[i];
//                     }
                    
//                     temp[i][j] = Math.max(doSomething, doNothing);
//                 }
//             }
            
//             dp = temp;
//         }
        
//         return dp[0][0];
//     }
// }






class Solution{
	 public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][k+1];
        
        // As dp array is intialized to 0, we have already covered the base case
        
        for(int ind = n-1; ind>=0; ind--){
            for(int buy = 0; buy<=1; buy++){
                for(int cap=1; cap<=k; cap++){

                    if(buy==1){// We can buy the stock
                        dp[ind][buy][cap] = Math.max(0+dp[ind+1][1][cap], 
                                    -prices[ind] + dp[ind+1][0][cap]);
                     }

                    if(buy==0){// We can sell the stock
                        dp[ind][buy][cap] = Math.max(0+dp[ind+1][0][cap],
                                    prices[ind] + dp[ind+1][1][cap-1]);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
}