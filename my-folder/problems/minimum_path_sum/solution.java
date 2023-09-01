class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int [][] arr = new int[m+1][n+1];

        for (int [] a : arr){
            Arrays.fill(a, Integer.MAX_VALUE);
        }

       arr[0][0] = 0;
       arr[0][1] = 0;
       arr[1][0] = 0;
    //    if (m ==1 || n==1)
    //         return 1;

        for (int r = 1; r <= m; r++){

            for (int c = 1; c <=n ; c++ ){

                
                arr[r][c] = grid[r-1][c-1] +  Math.min( arr[r-1][c] , arr[r][c-1]);
            }
        }
    return arr[m][n];
    }
}