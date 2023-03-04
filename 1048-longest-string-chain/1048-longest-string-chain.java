class Solution {
    
    public int Com(String s1, String s2){
        if(s2.length()!=s1.length()+1)return 0;
        int f  = 0;
        int s = 0;
        while(s<s2.length()){
            if(f<s1.length() && s1.charAt(f)==s2.charAt(s)){
                f++;
                s++;
            }
            else{
                s++;
            }
        }
        if(f==s1.length() && s==s2.length())return 1;
        return 0;
    } 

    public int longestStrChain(String[] nums) {
       int n = nums.length;                
        int[]dp = new int[n];
        Arrays.sort(nums,(a,b)->a.length()-b.length());
        Arrays.fill(dp,1);        
        int maxi = 1;
        // for(int i=0; i<nums.length; i++)System.out.println(nums[i]);
        for(int i=0; i<n; i++){
            for(int p=0;p<i; p++){
                if(1+dp[p]>dp[i]&&Com(nums[p], nums[i])==1){
                    dp[i] = 1+dp[p];
                }
            }
            if(dp[i]>maxi){
                maxi = dp[i];
            }
            
        }
        return maxi;
    }
}
