class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if (obstacleGrid[m-1][n-1] == 1)
            return 0; 
        int [][] arr = new int[m+1][n+1];
         
        if (obstacleGrid[0][0] == 1)
            return 0;
        
        arr[1][1] = 1;
        

        for (int r = 1; r <= m; r++){

            for (int c = 1; c <=n ; c++ ){

                if (obstacleGrid[r-1][c-1] == 1)
                    {
                        arr[r][c] = 0;
                    }
                else {
                arr[r][c] += arr[r-1][c] + arr[r][c-1];
                }
            }
        }
        return arr[m][n];
    }
}