class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int k = intervals[0][1];   
        for (int i =1; i< intervals.length; i++){
            
            if (intervals[i][0] >= k )
            {
                k = intervals[i][1];
            } else {
                count++;
            }
        }

        return count;
    }
}