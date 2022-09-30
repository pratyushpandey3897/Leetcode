class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int [] ways = new int[cost.length];
        ways[0] = cost[0];
        ways[1] = cost[1];
        
        for (int i=2; i<cost.length ; i++){
            if (ways[i-1] < ways[i-2])
                ways[i] = cost[i]+ways[i-1];
            else
                ways[i] = cost[i]+ways[i-2];
        }
        
        return ways[cost.length-1] < ways[cost.length-2]? ways[cost.length-1]: ways[cost.length-2];
    }
}