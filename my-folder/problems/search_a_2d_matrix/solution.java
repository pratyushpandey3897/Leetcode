class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

      
        int n = matrix[0].length;
        for (int [] row : matrix){

            if (target >= row[0] && target <= row[n-1] ){

                int low = 0, high = n-1;
                while (low<=high){
                    int mid = low - (low-high)/2;
                    if (target == row[mid])
                        return true;
                    else if (target > row[mid]){
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                }

                return false; 
            }

        }

        return false;
        
    }
}