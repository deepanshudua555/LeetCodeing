class Solution {
    public boolean canPlaceFlowers(int[] arr, int x) {
        int n = arr.length;
        int one=0;
        if(x==0)return true;
        if(arr[0]==1)one++;
        if(arr[n-1]==1)one++;
        int oneCount =0;
        if(arr[0]==0 && n==1 && x==1)return true;
        if(arr[0]==1 && n==1 )return false;
        
        if(arr[0]==0 && arr[1]==0){
            arr[0]=1;
            oneCount++;
        }
        
        
        for(int i=1; i<n-1; i++){
            if(arr[i]==1)one++;
         if(arr[i-1]==0&&arr[i+1]==0 && arr[i]!=1){
             oneCount++;
             arr[i]=1;
         }   
        }
        
        if(arr[n-1]==0 && arr[n-2]==0){
            arr[n-1]=1;
            oneCount++;
        }
        System.out.println(one +" "+oneCount);
        int remOne = one-oneCount;
        return (x<=oneCount);
        
        
    }
}