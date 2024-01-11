class Solution {
     int directions [][] = {{0,1}, {1,0}, {-1,0}, {0,-1}};
     int r , c;
    public void solve(char[][] board) {
        this.r = board.length;
        this.c = board[0].length;
        for (int i = 0; i < c; i++){
            dfs(0, i, board);
            dfs(r-1, i, board);
        }
        // for (int i = 0; i < c; i++){
            
        // }
        for (int i = 0; i < r; i++){
            dfs(i, 0, board);
            dfs(i, c-1, board);
        }
        // for (int i = 0; i < r; i++){
            
        // }

        for (int i = 0 ; i < r; i++){
            for (int j = 0 ; j < c; j++){
                if (board[i][j] == 'E'){
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }


    public void dfs(int i, int j, char[][] board){

        if (i> this.r-1 || j > this.c-1 || i<0 || j< 0)
            return;
        if (board[i][j] != 'O')
            return;

        board[i][j] = 'E';
        
        dfs(i+1, j ,board);
        dfs(i, j+1, board);
        dfs(i-1, j, board);
        dfs(i, j-1, board);

        return;
    }
}