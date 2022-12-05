class Solution {
    public int countOdds(int low, int high) {
       if(low%2==1 && high%2==1)return ((high-low)/2)+1;
        if(low%2==0 && high %2==0)return (high-low)/2;
        if(low%2==1 && high%2==0 || low%2==0 && high%2==1)return ((high-low)/2)+1;
        else return 0;
    }
}

//1 2 3 4 5 6 
// 3 4 5 6 7