class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));

        int arrow = 1;
        if (points.length == 1)
            return arrow;
        int prevStartTime = points[0][0];
        int prevEndTime = points[0][1];

        for (int i =1; i<points.length; i++){

            int currStartTime = points[i][0];
            int currEndTime = points[i][1];

            if (prevEndTime < currStartTime){
                arrow++;
                prevEndTime = currEndTime;
                prevStartTime = currStartTime;
            }
            else if (prevEndTime > currEndTime){

                prevEndTime = currEndTime;
                prevStartTime = currStartTime;
            }
        }

        return arrow;
    }

}