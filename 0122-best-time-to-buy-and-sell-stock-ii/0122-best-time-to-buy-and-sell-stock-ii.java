class Solution {
    
   
    
    public int maxProfit(int[] p) {
        int n = p.length;    
        Integer[]ahead = new Integer[2];
        Integer[]curr = new Integer[2];
        ahead[0] = 0;
        ahead[1] = 0;
        for(int ind=n-1; ind>=0; ind--){
            for(int buy = 0;buy<=1; buy++){
                int profit = 0;
                if(buy==1){
                    profit = Math.max(-p[ind]+ahead[0], 0+ahead[1]);
                }
                else{
                    profit = Math.max(p[ind]+ahead[1],0+ahead[0]);
                }
                 curr[buy] = profit;
            }
            ahead = curr;
        }
        return ahead[1];
    }
}