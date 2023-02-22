// class Solution {
  
//     public int f(int ind, int buy, int cap, int[] p, int n){
//        if(ind==n||cap==0)return 0;
        
//         if(buy==1){
//             return Math.max(-p[ind]+f(ind+1,0,cap,p,n), 0+f(ind+1, 1, cap,p,n));
//         }
//         return Math.max(p[ind]+f(ind+1,1,cap-1,p,n),0+f(ind+1,0,cap,p,n));
//     }
    
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         return f(0,1,2,prices,n);
//     }
// }


class Solution {
	int dp[][][];
		public int maxProfit(int[] prices) {
			int n = prices.length;
			dp = new int[n][2][3];

			for (int i=0;i<n;i++){
				for (int j=0;j<2;j++) Arrays.fill(dp[i][j],-1);
			}

			return find_max_profit(0,1,prices,2,n);
		}
		private int find_max_profit(int ind,int buy,int[] prices,int cap,int n){
			if (ind == n || cap == 0) return 0;

			if (dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

			// if buy = 1 we need to buy anything
			if (buy == 1){
				int buying = -prices[ind] + find_max_profit(ind+1,0,prices,cap,n);
				int not_buying = find_max_profit(ind+1,1,prices,cap,n);
				return dp[ind][buy][cap] = Math.max(buying,not_buying);
			}
			// if buy = 0  then we have already buy anything, this time we need to sell
			else
			{
				int selling = prices[ind] + find_max_profit(ind+1,1,prices,cap-1,n);
				int not_selling = find_max_profit(ind+1,0,prices,cap,n);
				return dp[ind][buy][cap] = Math.max(selling,not_selling);
			}
		}
	}