class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLen = matrix.length;
        int columLen = matrix[0].length;
        
        int r =0, c= columLen-1;
        while (r<rowLen && c>=0 ) {
            
            if (target == matrix[r][c])
                return true;
            
            else if (target < matrix[r][c])
                // so target is not in the column including c and greater
                c--;
            else
                // target > num so we have to go to the next row as the current row will have value lesser than this
                r++;
        }
        
        return false;
      
            
        }
    }
