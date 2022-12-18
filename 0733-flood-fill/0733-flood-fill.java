class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        if(image[sr][sc]==newcolor){
            return image;
        }
        fill(image, sr,sc,image[sr][sc],newcolor);
        return image;
    }
    
    public void fill(int[][] image, int sr,int sc,int color,int newcolor){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc] != color)return;
        image[sr][sc] = newcolor;
        fill(image, sr-1,sc,color,newcolor);
        fill(image, sr+1,sc,color,newcolor);
        fill(image, sr,sc-1,color,newcolor);
        fill(image, sr,sc+1,color,newcolor);
    }
}



// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//         // if we already have the newColor filled then just return the image
//         if(image[sr][sc] == newColor) return image;
//           fill(image, sr,  sc,  image[sr][sc],  newColor);
//         return image;
//     }
//     public void fill(int[][] image, int sr, int sc, int color, int newColor){ 
//         // Check that we don't get index out of bounds and if the color is already
//         if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color ){
//             return;
//         }
//         image[sr][sc] = newColor;
        
//         // Recursively calling this function 4-Directionally, we use Depth-First Search
//         fill(image, sr - 1,  sc,  color,  newColor);
//          fill(image, sr + 1,  sc,  color,  newColor);
//          fill(image, sr,  sc - 1,  color,  newColor);
//          fill(image, sr,  sc + 1,  color,  newColor);
//     }
// }