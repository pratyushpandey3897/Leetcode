class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        
        int [] dp = new int[high+1];

        dp[0] = 1; // one string with empty case
        int mod = 1000000007;
        for (int strend = 1; strend<=high; strend++){

            if (strend>=zero){
                dp[strend] += dp[strend-zero];
            }

            if (strend>=one){
                dp[strend] += dp[strend-one];
            }
            dp[strend] %= mod;
        }

        int res = 0;
        for (int i = low; i<=high;i++){
            res+= dp[i];
            res%=mod;
        }

        return res;

    }
}