class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[]result = new int[m];
        for(int i=0; i<m; i++){
            result[i] = findBallGoes(0,i,grid);
            
        }
        return result;
    }
    
    public int findBallGoes(int row, int col, int[][]grid){
        if(row==grid.length)return col;
        int nextCol = col+grid[row][col];
        if(nextCol<0||nextCol>grid[0].length-1||grid[row][col]!=grid[row][nextCol])return -1;
        return findBallGoes(row+1,nextCol, grid);
    }
}