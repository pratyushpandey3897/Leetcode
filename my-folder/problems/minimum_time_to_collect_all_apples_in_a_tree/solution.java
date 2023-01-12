class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        
        // int [][] graph = new int[n][n];
        // for (int[] edge : edges){

        //     graph[edge[0]][edge[1]] = 1;
        // }

        // int depth = 0;
        // int move = 0;
        // return ( dfs (graph, move, 0, hasApple));

        List<Integer>[] adj = new List[n];
    for (int i = 0; i < n; i++) {
        adj[i] = new ArrayList<>();
    }
    for (int[] edge : edges) {
        adj[edge[0]].add(edge[1]);
        adj[edge[1]].add(edge[0]);
    }
    int[] dp = new int[n];
    Arrays.fill(dp, -1);
    dfs(0, -1, adj, dp, hasApple);
    return dp[0];
    }

    // public int rr (int[][] graph, int move, int idx, List<Boolean> hasApple){

    //     int n = hasApple.size();
    //     int sum = 0;
        
    //     for (int i = idx+1; i<n; i++){

    //         if (graph[idx][i] == 1){
    //             sum += rr (graph, move, i, hasApple);
    //         }
    //     }


    //     if (idx ==0) return sum;
    //     if (hasApple.get(idx) || sum>0){
    //         return (sum + 2);
    //     }

    //     return 0;


    // }

    private void dfs(int u, int p, List<Integer>[] adj, int[] dp, List<Boolean> hasApple) {
    int time = 0;
    for (int v : adj[u]) {
        if (v == p) continue;
        dfs(v, u, adj, dp, hasApple);
        if (dp[v] > 0 || hasApple.get(v)) {
            time += dp[v] + 2;
        }
    }
    dp[u] = time;
}
}