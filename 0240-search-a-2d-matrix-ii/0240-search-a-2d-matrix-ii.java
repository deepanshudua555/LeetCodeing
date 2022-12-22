class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if(matrix[i][j] > target) 
                j--; // move left
            else if(matrix[i][j] < target) 
                i++; // move down
            else
                return true;
        }
        return false;
    }
}