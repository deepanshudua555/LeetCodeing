class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         if(intervals.length == 0 || intervals == null)
            return 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int ans = 0;
        int j=0;
        for(int i=1; i<n; i++){
            if(intervals[i][0]<intervals[j][1]){
                if(intervals[i][1]<=intervals[j][1]){
                    j=i;
                }
                ans++;
            }
            else{
                j=i;
            }
        }
        return ans;
    }
}