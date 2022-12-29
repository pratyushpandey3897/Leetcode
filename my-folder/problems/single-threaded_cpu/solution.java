class Solution {
    public int[] getOrder(int[][] tasks) {
        
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[2] - b[2])));

        int sortedTasks[][] = new int[tasks.length][3];
        for (int i = 0; i < tasks.length; ++i) {
            sortedTasks[i][0] = tasks[i][0]; // enqueue time
            sortedTasks[i][1] = tasks[i][1]; // processing time
            sortedTasks[i][2] = i; // index
        }

        Arrays.sort(sortedTasks , (a,b) -> Integer.compare(a[0] , b[0]));
        
        
        int [] res = new int[tasks.length];

        int currTime = 0;
        int taskIndex = 0;
        int ansIndex = 0;

        while(!heap.isEmpty() || taskIndex < tasks.length){

            if (heap.isEmpty() && currTime <= sortedTasks[taskIndex][0])
                currTime = sortedTasks[taskIndex][0];

            while (taskIndex < tasks.length && currTime >= sortedTasks[taskIndex][0]){
                heap.add(sortedTasks[taskIndex]);
                taskIndex++;
            } // filling 

            int [] ele = heap.poll();

            int processTime = ele[1];
            int enqTime = ele[0]; 
            int index = ele[2];

            currTime += processTime;
            res[ansIndex++] = index;
        }

        return res;
    }
}