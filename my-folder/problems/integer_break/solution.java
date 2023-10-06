class Solution {
    public int integerBreak(int n) {

        if (n<=3)
            return n-1;
        
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        helper(n, dp);
        return dp[n];
    }

    public void helper(int num, int [] dp){
        for (int i = 4; i<=num; i++){
            int possible = i;
            for (int j = 2; j <i ; j++ ){
                possible = Math.max(possible, j*dp[i-j] );
            }
            dp[i] = possible;
           
        }

        
        
    }
}