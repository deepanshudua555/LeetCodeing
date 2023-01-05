class Solution {
//     public int findMinArrowShots(int[][] points) {
//         if (points.length == 0) {
//             return 0;
//         }
//         Arrays.sort(points, (a, b) -> a[1] - b[1]);
//         int arrowPos = points[0][1];
//         int arrowCnt = 1;
//         for (int i = 1; i < points.length; i++) {
//             if (arrowPos >= points[i][0]) {
//                 continue;
//             }
//             arrowCnt++;
//             arrowPos = points[i][1];
//         }
//         return arrowCnt;
//     }
    public int findMinArrowShots(int[][] arr) {
        if(arr.length==0)return 0;
 Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int a = 1;
        int prev= arr[0][1];
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]>prev){
                a++;
                prev = arr[i][1];
            }
        }
        return a;
    }
}


// class Solution {
//     public int findMinArrowShots(int[][] segments) {
//         Arrays.sort(segments, (a, b) -> Integer.compare(a[1], b[1]));
//         int ans = 0, arrow = 0;
//         for (int i = 0; i < segments.length; i ++) {
//             if (ans == 0 || segments[i][0] > arrow) {
//                 ans ++;
//                 arrow = segments[i][1];
//             }
//         }
//         return ans;
//     }
// }
