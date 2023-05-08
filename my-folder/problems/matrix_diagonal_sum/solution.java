class Solution {
    public int diagonalSum(int[][] mat) {
        
        int prim = 0;
        int sec = mat[0].length-1;
        int sum =0;

        for (;prim<mat[0].length && sec>=0;){
            if (prim!=sec)
            sum += mat[prim][prim] + mat[prim][sec];
            else 
            sum += mat[prim][prim];

            prim++;
            sec--;
            
        }
        return sum;
    }
}