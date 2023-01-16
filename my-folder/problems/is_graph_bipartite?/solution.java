class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int [] visited = new int[graph.length];
        for (int i =0; i<graph.length; i++){ // we have to do this since the graph might be not completely connected

            if (visited[i] == 0) // if not visited
                if (bfs(graph,i,visited) == false) // we start coloring the source with -1
                    return false;
        }
        return true;
    
    }
    public boolean bfs(int[][] graph, int i, int[] visited){

        
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(i);
        visited[i] = -1; // start coloring source from -1

        while(!queue.isEmpty()){
            int ele = queue.poll();
            int [] adj = graph[ele];
            int color = visited[ele];
            for (int node : adj){
                
                if (visited[node] == color) 
                    return false;
                else if (visited[node] == 0) { //not visited or color is different
                    queue.offer(node);
                    visited[node] = color * (-1);
                }

            } 
        }

        return true;


    }
}