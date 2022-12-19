class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis  = new boolean[grid.length][grid[0].length];
        for(int i=0; i<vis.length; i++){
            for(int j=0; j<vis[0].length; j++){
                vis[i][j] = false;
            }
        }
        int count = 0;
        
        for(int i=0;i< vis.length;i++){
            for(int j=0; j<vis[0].length; j++){
                if(!vis[i][j] &&grid[i][j]=='1'){
                    traverse(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void traverse(int row, int col, char[][]grid, boolean[][]vis){
        if(row<0 || col<0||row>=grid.length||col>=grid[0].length)return;
        if(vis[row][col])return ;
        vis[row][col]=true;
        if(grid[row][col]=='0')return;
        traverse(row + 1, col, grid, vis);
        traverse(row - 1, col, grid, vis);
        traverse(row, col + 1, grid, vis);
        traverse(row, col - 1, grid, vis);
    }
}




