class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int Max = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count =1;
                if(grid[i][j]==1){
                    int res = count_island(grid,i,j,count);
                    Max = Math.max(Max,res);
                }
            }
        }
        return Max;
    }
    
    public int count_island(int[][] grid,int i,int j, int count){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0)return 0 ;
       
       
        grid[i][j] = 0;
        int up = count_island(grid, i+1, j, count);
        int down = count_island(grid, i-1, j, count);
        int left = count_island(grid, i, j-1, count);
        int right = count_island(grid, i, j+1, count);
       
        count = count+up+down+left+right;
        return count;
    }
}