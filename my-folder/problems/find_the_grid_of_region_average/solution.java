class Solution {
    public int[][] resultGrid(int[][] image, int k) {
        
        int m = image.length, n = image[0].length;
    
        
        int [][] res = new int[m][n];
        int [][] count = new int[m][n];
        
        for(int wi=0; wi<=m-3; wi++ ){
            for (int wj = 0; wj<=n-3;wj++){
                
                // calc curr average
                
                int curravg = 0;
                boolean flag = true;
                
                
                for (int i= wi; i<wi+3; i++){
                    for (int j = wj; j<wj+3; j++){
                        
                        if (!isCurrentPositionValid(image, i,j, k,wi, wj)){

                            flag = false;
                            break;

                        } else {
                            
                            curravg = ((curravg + image[i][j]));
                        }
                    }
                    if (flag == false){
                        
                            break;
                    }
                    
                }
                
                if (flag){ // update average 
                    curravg = curravg/9;
                    for(int i= wi; i<wi+3; i++){
                        for(int j = wj; j<wj+3; j++){
                            res[i][j] = ((res[i][j]+curravg));
                            count[i][j]++;
                        }
                    }
                }
                
            }
        }
        
        for (int i = 0; i< m; i++ )
            for(int j=0; j< n; j++)
                if (count[i][j] != 0){
                    res[i][j] = (res[i][j] / count[i][j]);
                }
                else
                    res[i][j] = image[i][j];
        return res;
        
    }
    
    public boolean isCurrentPositionValid(int[][] image, int row, int col, int threshold, int startRow, int startCol) {
        if(row - 1 >= startRow && Math.abs(image[row-1][col] - image[row][col]) > threshold)
            return false;
        if(row + 1 <= startRow + 2 && Math.abs(image[row+1][col] - image[row][col]) > threshold)
            return false;
        if(col - 1 >= startCol && Math.abs(image[row][col-1] - image[row][col]) > threshold)
            return false;
        if(col + 1 <= startCol + 2 && Math.abs(image[row][col+1] - image[row][col]) > threshold)
            return false;
        return true;
    }
}