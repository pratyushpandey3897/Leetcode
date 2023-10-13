class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int mincost1 = cost[0];
        int mincost2 = cost[1];

        int [] dp = new int[cost.length];
        dp[0] = mincost1;
        dp[1] = mincost2;

        for (int i = 2; i< cost.length; i++){
            dp[i] = Math.min( (cost[i] + dp[i-2]), cost[i] + dp[i-1] );
        } 

        return Math.min( dp[cost.length-1], dp[cost.length-2] );
        
    }
}