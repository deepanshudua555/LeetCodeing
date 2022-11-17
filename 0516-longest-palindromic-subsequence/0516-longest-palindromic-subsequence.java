class Solution {
    
    public int findLength(char[] nums1, char[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Integer[][]dp = new Integer[n1+1][n2+1];
        for(int i=0; i<=n1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n2;j++){
            dp[0][j] = 0;
        }
        int ans = 0;
        for(int idx1=1;idx1<=n1;idx1++){
            for(int idx2=1;idx2<=n2;idx2++){
             if(nums1[idx1-1]==nums2[idx2-1]){
                dp[idx1][idx2] = 1+dp[idx1-1][idx2-1];
                 ans = Math.max(ans,dp[idx1][idx2]);
            }
            else dp[idx1][idx2] = 0+Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);   
            }
        }
        return ans;
    }
    
    public int longestPalindromeSubseq(String s) {
        char[]ch = s.toCharArray();
        StringBuilder sb=new StringBuilder(s);  
        sb.reverse();  
        char[]rch =  sb.toString().toCharArray();
        for(int i=0; i<ch.length; i++)System.out.print(rch[i]);
        return findLength(ch, rch);
    }
}