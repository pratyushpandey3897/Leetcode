class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] reshapedMat = new int[r][c];
        if (r*c == mat.length*mat[0].length){
        
        
        List<Integer> l = new ArrayList<Integer>();
        for (int row =0;row<mat.length; row++)
        {
            for (int col =0; col<mat[row].length; col++){
                l.add(mat[row][col]);
            }
        }
        
        int listCtr = 0;
        for (int row =0;row<r; row++)
        {
            for (int col =0; col< c; col++){
                reshapedMat[row][col] = l.get(listCtr);
                listCtr++;
            }
        }
        } else {
            reshapedMat = mat;
        }
        return reshapedMat;
        
    }
}