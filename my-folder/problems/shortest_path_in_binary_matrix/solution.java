class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0,0,1});
        grid[0][0] = 1;

        int[][] directions = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1}, {1,0}, {1,1}          
        };

        while (!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            int distance = cell[2];

            if (row == n-1 && col == n-1){
                return distance;
            }

            for (int[] move: directions){
                int newRow = row + move[0];
                int newCol = col + move[1];

                if(newRow >= 0 && newRow <=n-1 && newCol >=0 && newCol <= n-1 && grid[newRow][newCol] == 0){
                    grid[newRow][newCol] = 1;
                    queue.offer(new int[]{newRow,newCol,distance+1});
                }
            }
        }

        return -1;
        
    }

    
}