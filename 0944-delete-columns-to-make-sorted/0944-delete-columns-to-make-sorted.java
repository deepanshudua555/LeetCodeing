class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m  = strs[0].length();
        int sum= 0;
        int x=0;
        for(int i=0;i<m; i++){
            x=0;
            for(int j=0;j<n-1; j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i) && x==0){
                    System.out.print(strs[j].charAt(i)+" "+strs[j+1].charAt(i)+"      ");  
                    x++;
                    sum+=1;
                }
            }
            System.out.println();
        }       
        return sum;
    }
}