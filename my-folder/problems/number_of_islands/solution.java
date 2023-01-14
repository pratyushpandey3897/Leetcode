class Solution {
    public int numIslands(char[][] grid) {
        
        int numOfIsl =0;
        for (int i =0; i< grid.length; i++){
            
            for (int j=0; j< grid[0].length; j++){
                
                if (grid[i][j] == '1'){
                    
                    dfs(grid, i, j);
                    numOfIsl++;
                    
                }
                
            }
        }
        return numOfIsl;
    }

    int [] dx = {-1,1,0,0};
    int [] dy = {0,0,-1,1};
    
    public void dfs(char[][] grid, int i, int j){
        
        grid[i][j]= 2;

        for (int d =0; d<4; d++){

            int x = i+dx[d];
            int y = j+dy[d];

            if (x >=0 && x< grid.length && y>=0 && y<grid[0].length && grid[x][y] == '1') {
                dfs(grid, x, y);
            }
        }


    }
}