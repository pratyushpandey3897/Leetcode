
class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int[][] dp = new int[matrix.length][matrix[0].length];
        int r = matrix.length;
        int c = matrix[0].length;

         for (int i = 0; i<c; i++){
             dp[r-1][i] = matrix[r-1][i];
         }

         for (int i = r-2; i>=0; i--){
             for (int j = 0; j<c; j++){

                 if (j == 0)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j], dp[i+1][j+1] );
                else if (j==c-1)
                    dp[i][j] = matrix[i][j] +Math.min(dp[i+1][j-1], dp[i+1][j] );
                else
                    dp[i][j] = matrix[i][j] +Math.min(dp[i+1][j], Math.min(dp[i+1][j-1],dp[i+1][j+1]));
             }
         }
        
        int [] row1 = dp[0];
        for(int a:row1)
            System.out.println(a);
        Arrays.sort(row1);
        return row1[0];
        
    }
}