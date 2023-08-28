class Solution {
    int [] ans;
    public int numSquares(int n) {
        ans = new int[n+1];

        Arrays.fill(ans, Integer.MAX_VALUE);
        // ans [0] = 0;
        // for (int i = 1 ; i <= n ; i++ ){
        //     ans[i] = i;
        //     for (int j = 1; j*j <= i; j++){
        //         ans[i] = Math.min(ans[i] , ans[i- (j*j)] + 1);
        //     }
        // }

        // return ans[n];

        return dp (ans, n);
        
    }

    public int dp (int []dp, int n ){

        // if (n == 1)
        //     return 1;
        if (n == 0)
            return 0;

        if (dp[n] != Integer.MAX_VALUE)
            return dp[n];

        
        for (int i = 1 ; i*i <= n; i++){
            dp[n] = Math.min ( dp[n] , dp(dp, n - (i*i) ) + 1);
            
        }

        return dp[n];
    }
}