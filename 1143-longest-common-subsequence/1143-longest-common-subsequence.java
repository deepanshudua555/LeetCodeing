class Solution {
    
//     public int helper(int idx1,int idx2,String t1,String t2,Integer[][]dp){
//         if(idx1==0|| idx2==0)return 0;
//         if(dp[idx1][idx2]!=null)return dp[idx1][idx2];
//         if(t1.charAt(idx1-1)==t2.charAt(idx2-1)){
//             return dp[idx1][idx2] = 1+helper(idx1-1,idx2-1,t1,t2,dp);
//         }
//         return dp[idx1][idx2] = 0+Math.max(helper(idx1-1,idx2,t1,t2,dp),helper(idx1,idx2-1,t1,t2,dp));
        
//     }
    
    public int longestCommonSubsequence(String text1, String text2) {
       
         int n1 = text1.length();
        int n2 = text2.length();
        int[]prev = new int[n2+1];
        int[]curr = new int[n2+1];
       
        for(int idx1=1;idx1<=n1;idx1++){
            for(int idx2=1;idx2<=n2;idx2++){
             if(text1.charAt(idx1-1)==text2.charAt(idx2-1)){
                curr[idx2] = 1+prev[idx2-1];
            }
            else curr[idx2] = 0+Math.max(prev[idx2],curr[idx2-1]);   
            }
            prev=(int[])(curr.clone());
        }
        return prev[n2];
    }

    


}