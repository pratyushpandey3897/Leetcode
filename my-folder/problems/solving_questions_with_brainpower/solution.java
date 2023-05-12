class Solution {
    // long dp[];
    // public long mostPoints(int[][] questions) {
    //     dp = new long[questions.length];
    //     return recurse(questions, 0);
    // }
    // public long recurse(int[][] Q, int i) {
    //     if (i >= Q.length) return 0;
    //     if (dp[i] > 0) return dp[i];
    //     int points = Q[i][0], jump = Q[i][1];
    //     // either skip the question and move to the next index or solve the question and jump to the next allowed question
    //     return dp[i] = Math.max(recurse(Q, i + 1), points + recurse(Q, i + jump + 1));
    // }


// Iterative Approach, bottom up approach
    public long mostPoints(int[][] questions) {
        
        int n = questions.length;
        long [] dp = new long[n+1];
        for (int i = n-1; i>=0; i--){
            int points = questions[i][0];
            int jump = questions[i][1];
            dp[i] = Math.max(points+dp[Math.min(i+jump+1 , n)], dp[i+1]);
        }
        return dp[0];
    }
}