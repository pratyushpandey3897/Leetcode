class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int startCol=0;
        int startRow = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length-1;
        int total = m*n;
        int cnt=0;
        List<Integer> l = new ArrayList<>();

        while(cnt < total){
        for (int i=startCol; cnt < total && i<=endCol; i++){
            l.add(matrix[startRow][i]);
            cnt++;
        }

        startRow++;

        for (int i = startRow;  cnt < total && i<=endRow ; i++){
            l.add(matrix[i][endCol]);
            cnt++;
        }

        endCol--;
        for (int i = endCol;  cnt < total && i>=startCol ; i--){
            l.add(matrix[endRow][i]);
            cnt++;
        }

        endRow--;
        for (int i = endRow;  cnt < total && i>=startRow ; i--){
            l.add(matrix[i][startCol]);
            cnt++;
        }
        startCol++;


        }

        return l;
    }
}