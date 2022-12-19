class Solution {
    public int longestPalindrome(String s) {
        int[] farr = new int[52];
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                farr[s.charAt(i)-'a'] = farr[s.charAt(i)-'a']+1;
            }
            else{
                farr[(s.charAt(i)-'A')+26] = farr[(s.charAt(i)-'A')+26]+1;
            }
        }
        Arrays.sort(farr);
        int x = 0;
        int ans =0;
        for(int i=farr.length-1;i>=0;i--){
            if(farr[i]%2==0){
                ans+=farr[i];
            }
            else{
                if(farr[i]%2==1 && x==0){
                    ans+=farr[i];
                    x++;
                }
                else{
                    ans+=(farr[i]-1);
                }
            }
        }
        return ans;
    }
}