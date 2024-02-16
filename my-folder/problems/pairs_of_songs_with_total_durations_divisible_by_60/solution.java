class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int [] rem = new int[60];
        int pairs = 0;
        for (int t : time){
            if (t%60 == 0){
                pairs += rem[0];
            } else {
                pairs += rem[60 - (t%60)];
            }

            rem[t%60]++;
        }

        return pairs;
    }
}