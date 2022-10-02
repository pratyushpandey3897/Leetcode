class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int [] minCostTillHere = new int[cost.length];
        minCostTillHere[0] = cost[0];
        minCostTillHere[1] = cost[1];
        
        for (int i=2; i<cost.length ; i++){
                minCostTillHere[i] = cost[i]+ Math.min(minCostTillHere[i-1],minCostTillHere[i-2]) ;
        }
        
        return Math.min(minCostTillHere[cost.length-1], minCostTillHere[cost.length-2]);
    }
}