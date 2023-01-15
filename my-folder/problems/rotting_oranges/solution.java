class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int [][] visited = new int[grid.length][grid[0].length];

        for (int i =0; i< grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                
                if (grid[i][j] == 2) {// multisource BFS, put all start point in the queue
                    q.offer(new int[]{i , j});
                    visited[i][j] = 0;
                } 
                else 
                    visited[i][j] = -1;
            }
        }

        bfs (grid, visited, q);
        int time =0;

        for (int i =0; i< grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                
                if (grid [i][j] != 0 && visited[i][j] == -1) {// not visited
                    return -1;
                } 
                else 
                    time = Math.max(time, visited[i][j]);
            }
        }
        return time;

        

    }

    public void bfs (int [][]grid, int[][] visited, Queue<int[]> q){

            while (!q.isEmpty()){

                int [] ele = q.poll();
                int time = visited[ele[0]][ele[1]];

                int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
                
                for (int [] dir: dirs){

                    int x = ele[0] + dir[0];
                    int y = ele[1] + dir[1];

                    if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || visited[x][y] != -1) 
                        continue;

                    //otherwise mark the orange as rotten and add it to the queue
                    grid[x][y] = 2;
                    // record visited time
                    visited[x][y] = time+1;
                    //put the new rotten orange at (x , y) in queue
                    q.offer(new int[]{x , y});
                }
            }

            // return visited;
    }
}