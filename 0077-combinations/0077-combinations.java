class Solution {
    private List<List<Integer>> res = new ArrayList<>();
       private List<Integer> curr = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       
        rec(1,n,k);
        return res;
    }
    
    public void rec(int start, int n, int k){
        if( k==curr.size()){
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=start; i<=n; i++){
            curr.add(i);
            rec(i+1, n, k);
            curr.remove(curr.size()-1);
        }
    }
}