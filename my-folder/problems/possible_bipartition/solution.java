class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        if (dislikes.length == 0)
            return true;
        int [] grouped = new int[n];
        Arrays.fill(grouped, -1);
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i =0; i< dislikes.length; i++){

            int a_i = dislikes[i][0];
            int b_i = dislikes[i][1];
            adj.putIfAbsent(a_i, new ArrayList<>());
            adj.putIfAbsent(b_i, new ArrayList<>());
            adj.get(a_i).add(b_i);
            adj.get(b_i).add(a_i);
        }

        for (int i=1; i<=n; i++) {

            if (grouped[i-1] == -1) {
                grouped[i-1] = 0;
                if (!dfs(i, grouped, adj))
                    return false;
            }
        }

        return true;
            
        
    }

    public boolean dfs (int i, int[] grouped, Map<Integer, List<Integer>> adj ){

        if (adj.getOrDefault(i, new ArrayList<>()).size() == 0)
            return true;

        for (int v: adj.get(i)){

            if (grouped[v-1] == -1){ // un visited
                grouped[v-1] = 1-grouped[i-1];
                if (!dfs(v, grouped, adj))
                    return false;  
            }else if (grouped[v-1] == grouped[i-1] )
                return false;
        }

        return true;

    }
}