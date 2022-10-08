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
    
    public void dfs(char[][] grid, int i, int j){
        
        if ( i<0 || j< 0 || i>grid.length-1 || j> grid[0].length-1 || grid[i][j] =='2')
            return;
        
        if (grid[i][j] == '1')
        {
            grid[i][j] = '2'; // to track if a node is visited
            
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
        }
    }
}