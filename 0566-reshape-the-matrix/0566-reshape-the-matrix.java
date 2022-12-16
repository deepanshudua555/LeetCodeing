class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c)return mat;
        int[] arr = new int [r*c];
        int k=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length;j++){
                arr[k++] = mat[i][j];
            }
        }
        k=0;
        int[][] matt = new int[r][c];
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                matt[i][j] = arr[k++];
            }
        }
        return matt;
    }
}