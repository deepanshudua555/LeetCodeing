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
        Integer[][]dp = new Integer[n1+1][n2+1];
        for(int i=0; i<=n1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n2;j++){
            dp[0][j] = 0;
        }
        for(int idx1=1;idx1<=n1;idx1++){
            for(int idx2=1;idx2<=n2;idx2++){
             if(text1.charAt(idx1-1)==text2.charAt(idx2-1)){
                dp[idx1][idx2] = 1+dp[idx1-1][idx2-1];
            }
            else dp[idx1][idx2] = 0+Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);   
            }
        }
        
        int len = dp[n1][n2];
        int i=n1;
        int j=n2;
        int index = len-1;
        String ans = "";
        // for(int i=0;i<len; i++){
        //     str+='$';
        // }
        
        while(i>0&&j>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                ans+=text1.charAt(i-1);
                index--;
                i--;j--;
            }
            else if (dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else j--;
        }
        System.out.println(ans);

        
        
        // for(int i=0; i<=n1; i++){
        //     for(int j=0;j<=n2;j++){
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println(ans);
        return dp[n1][n2];
    }
}