class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int res = 0;
        for(int i = 0;i < n-1;i++){
            int a = Math.abs(points[i][0]-points[i+1][0]);
            int b = Math.abs(points[i][1]-points[i+1][1]);
            if(a>b){
                res += b;
                res += a-b;
            }
            else{
                res += a;
                res += b-a;
            }
        }
        return res;
    }
}
