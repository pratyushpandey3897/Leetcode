class Solution {
    public int maximumDetonation(int[][] bombs) {
        
        //make graph were each bomb is a node and the bomb it detonates is 
        // linked with a directed edge
        int n = bombs.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i =0 ; i< n ; i++){
            int x1 = bombs[i][0], y1 = bombs[i][1], r1 = bombs[i][2];
            for (int j = i+1; j<n; j++){

                int x2 = bombs[j][0], y2 = bombs[j][1], r2 = bombs[j][2];

                //euclidian dist
                long dist = ( (long)(x1-x2)*(x1-x2) + (long)(y1-y2)*(y1-y2) );

                if ((long)r1*r1 >= dist){
                    graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }

                if ((long) r2*r2 >= dist){
                    graph.computeIfAbsent(j, k -> new ArrayList<>()).add(i);
                }

            }
        }  

        int ans = 0;

        for (int i = 0; i<n; i++){
            int detonated = dfs(graph, new HashSet<>(), i);
            ans = Math.max(ans, detonated);
        }

        return ans;


    }

    public int dfs (Map<Integer, List<Integer>> graph, Set<Integer> visited, int bomb) {
        visited.add(bomb);
        for (int nextbomb : graph.getOrDefault(bomb, new ArrayList<>())){

            if(!visited.contains(nextbomb)){
                dfs(graph, visited, nextbomb);
            }
        }
        return visited.size();
    }
}