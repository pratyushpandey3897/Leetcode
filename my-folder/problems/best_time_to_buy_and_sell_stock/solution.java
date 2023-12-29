class Solution {
    public int maxProfit(int[] prices) {
        
        int leftptr = 0;
        int rightptr = 1;
        int maxprof = 0;

        while (leftptr <prices.length && rightptr < prices.length){

            if (prices[leftptr] < prices[rightptr]){
                maxprof = Math.max(prices[rightptr] - prices[leftptr], maxprof);
                rightptr++;
            } else{
                leftptr = rightptr;
                rightptr++;
            }
        }
        return maxprof;
    }
}