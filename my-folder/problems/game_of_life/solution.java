class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int [][] dir = {{ 0,1}, {0,-1}, {1,0}, {-1,0}, {-1,1}, {-1,-1}, {1,1}, {1,-1}};

        int [][] newbrd = new int[m][n];
        for (int i =0 ; i< m; i++){
            for (int j = 0; j <n; j++){
                int liven = 0;

                for (int[] d: dir){
                    int nx = i+d[0];
                    int ny = j+d[1];

                    if (nx<0 || nx >= m || ny<0 || ny>=n){
                        continue;
                    } 

                    else if (board[nx][ny] == 0){
                        continue;
                    } 

                    else if (board[nx][ny] == 1)
                        liven++;
                }

                if (liven <2){
                    newbrd[i][j] = 0;
                } else if (liven == 3 ){
                    newbrd[i][j] =1;
                } else if (liven > 3){
                    newbrd[i][j] =0;
                } else if (liven == 2){
                    newbrd[i][j] = board[i][j];
                }
            }
        }


        for (int i =0 ; i< m; i++){
            for (int j = 0; j <n; j++){
                board[i][j] = newbrd[i][j];
            }
        }

        board = newbrd;
    }
}