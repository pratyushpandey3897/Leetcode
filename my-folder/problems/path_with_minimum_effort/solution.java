class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        int[][] effort = new int [n][m];

        for (int arr[] : effort) Arrays.fill(arr, Integer.MAX_VALUE);

        // decalre a min heap with max effert to reach a node. for node we will store the row and colun number for identification
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        minHeap.offer(new int[]{0,0,0}); // for the first node, effort is 0 and row = col = 0
        effort[0][0] = 0;

        int [][] directions = new int[][]{ {0,1}, {1,0}, {0,-1}, {-1,0}};
        while (!minHeap.isEmpty()){
            int minEle[] = minHeap.poll();
            int eff = minEle[0], row = minEle[1], col = minEle[2];
            // if (row == n - 1 && col == m - 1) return eff;

            for (int[] dr: directions){
                int newRow = row + dr[0];
                int newCol = col + dr[1];

                if(newRow >= 0 && newRow <n && newCol >=0 && newCol <m){
                    int neweff = Math.max(eff, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    if (effort[newRow][newCol] > neweff){
                        effort[newRow][newCol] = neweff;
                        minHeap.offer(new int[] {neweff, newRow, newCol});
                    }
                }
            }
        }

        

        return effort[n-1][m-1];
        
        
    }
}