class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        // int [][] graph = new int [n][n];
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visited  = new boolean[n];

        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
         //construct graph, add bidirectional vertex
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }

        // for (int i = 0 ; i< edges.length; i++){

        //     // graph
        //     graph[edges[i][0]][edges[i][1]] = 1;
        //     graph[edges[i][1]][edges[i][0]] = 1;
        // }

        dfs(graph, source, destination, visited );
        return found;
    }

    public void dfs (Map<Integer,List<Integer>> graph, int source, int dest, boolean[] visited){
            if (source == dest || found){
                found = true;
                return;
            }
            else {
                visited[source] = true;

                for(int i : graph.get(source)){
                    if(i == dest){
                        found = true;
                        break;
                    }
                    if (visited[i] != true)
                        dfs(graph, i, dest, visited);
                }

                // for (int i =0; i<graph.length; i++){

                //     if (graph[source][i] == 1 && i == dest){
                //         found = true;
                //         return;
                //     }
                //     if (visited[i] != true)
                //         dfs(graph, i, dest, visited);
                // }
                // return;
            }
    }
}