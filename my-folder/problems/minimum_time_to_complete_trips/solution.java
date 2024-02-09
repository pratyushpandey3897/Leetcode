class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        // 1 2 5 10 15    8
        // 
        // 1, 4, 5
        
        long sum = 0;
        for (int t : time){
            
        }
        
        long lo = 0, hi = (long)1e14;
        while (lo < hi){
            long mid = (lo + hi)/2;
            long mintime = mid;
            long trips = 0;
            for (int t :  time ){
                trips += (mintime/t);
            }
            
            if (trips < totalTrips){
                lo = mid +1;
            } else if (trips >= totalTrips){
                hi = mid;
            }
            // } else {
            //     return mintime;
            // }
            
        }
        
        return lo;
        
    }
}