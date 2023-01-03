class Solution {

    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length(); 
        boolean prev[] = new boolean[m + 1];
        boolean cur[] = new boolean[m + 1];
         prev[0] = true;
        for(int j=1; j<=m; j++){
           cur[j] = false;
        }
        
        
        for(int i=1; i<=n; i++){
            boolean flag = true; 
            for(int ii =1;ii<=i;ii++){
                if(p.charAt(ii-1)!='*'){
                    flag = false;
                    break;
                }
            }
            cur[0] = flag;
            for(int j=1;j<=m; j++){
                if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i-1)=='?'){
                     cur[j]= prev[j-1];
                }
                else if(p.charAt(i-1)=='*'){
                    cur[j] =  cur[j-1]|prev[j];
                }
                else cur[j]=false;
            }
            prev = (boolean[]) cur.clone();
        }
        
        return prev[m];
    }
}