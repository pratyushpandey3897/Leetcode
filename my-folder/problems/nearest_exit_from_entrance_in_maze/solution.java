class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        

        
        int r = maze.length;
        int c = maze[0].length;

        int step =0;
        Queue<int []> q
            = new LinkedList<>();

        q.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        // declare directions 
        int [][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};

        while (!q.isEmpty()){
            step++;
            int n = q.size();
            for (int i=0; i< n; i++){

                int[] current = q.poll();
               

                for (int [] dir : directions){

                    int x = current[0] + dir[0];
                    int y = current[1] + dir[1];

                    if (x < 0 || y <0 || x>= r || y>= c)
                        continue;
                    if (maze[x][y] == '+')
                        continue;

                    if (x == 0 || y == 0 || x == r-1 || y == c-1)
                        return step;
                    
                    maze[x][y] = '+';
                    q.offer(new int[]{x,y});


                }


            }

        }

        return -1;

    }
}