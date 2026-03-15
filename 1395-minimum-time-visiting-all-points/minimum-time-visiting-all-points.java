class Solution {
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int time = 0;

        // every pair traverse ke liye
        for(int i = 1; i < points.length; i++)
        {
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];

            int x2 = points[i][0];
            int y2 = points[i][1];

            // x direction meh distance
            int dx = Math.abs(x2 - x1);

            // y direction ki distance
            int dy = Math.abs(y2 - y1);

            // minimum time 
            time = time + Math.max(dx, dy);
        }
        return time;
    }
}