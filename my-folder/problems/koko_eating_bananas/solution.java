class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int lo = 0;
        int hi = 1000000000;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            int hrs = 0;
            for (int i = 0;i<piles.length; i++){

                hrs += Math.ceil((double)piles[i]/mid);
                if (hrs > h){
                    break;
                }
            }

            if (hrs > h){
                lo = mid +1;
            } else {
                hi = mid-1;
            }
        } 

        return lo;
        
    }
}