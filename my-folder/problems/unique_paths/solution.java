class Solution {
    public int uniquePaths(int m, int n) {
        
        // bottom up
        
       int [][] arr = new int[m+1][n+1];

       arr[1][1] = 1;
       if (m ==1 || n==1)
            return 1;

        for (int r = 1; r <= m; r++){

            for (int c = 1; c <=n ; c++ ){

                
                arr[r][c] += arr[r-1][c] + arr[r][c-1];
            }
        }
    return arr[m][n];
        

    }


}