class Solution {
    Integer [] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new Integer[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for (int i = 1; i<= amount ; i++){
            for (int coin : coins){
                if (i-coin < 0) continue;
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        return dp[amount] == amount+1 ? -1: dp[amount];
    }

    public int recurse (int []coins, int amt){
;
        if (amt == 0)
            return 0;
        if (amt <0)
            return -1;
        if (dp[amt] != null) return dp[amt];

        int mincoincnt = Integer.MAX_VALUE;

        for (int coin : coins){

            int coincnt = recurse(coins, amt-coin);
            if (coincnt == -1) continue;
            mincoincnt = Math.min(mincoincnt, coincnt+1);
        }

        dp[amt] =  mincoincnt == Integer.MAX_VALUE? -1: mincoincnt;
        return dp[amt];
    }
}