class Solution {
    public int[][] generateMatrix(int n) {
        
        int [][] matx = new int[n][n];
        
        
        
        int startCol=0;
        int startRow = 0;
        int endCol = n - 1;
        int endRow = n -1;
        int total =  n*n;
        int cnt=1;

        while(cnt <= total){
        for (int i=startCol; cnt <= total && i<=endCol; i++){
            matx[startRow][i] = cnt;
            cnt++;
        }

        startRow++;

        for (int i = startRow;  cnt <= total && i<=endRow ; i++){
            matx[i][endCol] = cnt;
            cnt++;
        }

        endCol--;
        for (int i = endCol;  cnt <= total && i>=startCol ; i--){
            matx[endRow][i] = cnt;
            cnt++;
        }

        endRow--;
        for (int i = endRow;  cnt <= total && i>=startRow ; i--){
            matx[i][startCol] = cnt;
            cnt++;
        }
        startCol++;


        }

        return matx;
    
    }
}