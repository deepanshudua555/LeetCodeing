class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        
        for(int i=0;i <points.length; i++){
            if(points[i][0]!=x && points[i][1]!=y)continue;
            if(dis(points[i][0],points[i][1],x,y)<min){
                min = dis(points[i][0],points[i][1],x,y);
                res =i;
            }
        }
        return res;
    }
    
    public int dis(int x1,int y1,int x2,int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}