class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length){

            if (prices[left] >= prices[right]){
                left = right;
                right += 1;
            }
            else {
                int profit = prices[right] - prices[left];

                if (profit > 0){
                    maxProfit += profit;
                    left = right;
                    right += 1;
                }
            }
        }

        return maxProfit;
    }
}