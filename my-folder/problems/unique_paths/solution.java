class Solution {
    public int uniquePaths(int m, int n) {
        
        
        
       int [][] arr = new int[m+1][n+1];

       arr[1][1] = 1;
       if (m ==1 || n==1)
            return 1;
    return recurse(m-1, n, arr) + recurse(m,n-1, arr);
        

    }

    public int recurse(int m, int n, int[][] arr){

       
        if (arr[m][n] != 0)
            return arr[m][n];

        if (m ==1 || n==1)
            arr[m][n] = 1;
        // if (m<=1)
        //     arr[m][n] = recurse(m,n-1, arr);
        // else if (n<=1)
        //     arr[m][n] = recurse(m-1, n, arr);
        else
            arr[m][n] = recurse(m-1, n, arr) + recurse(m,n-1, arr);

        return arr[m][n];
    }


}