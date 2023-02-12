class Solution {
    long fuel;
    public long minimumFuelCost(int[][] roads, int seats) {
        
        List<List<Integer>> adj = new ArrayList<>();

        for (int i=0; i<= roads.length; i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int i=0; i< roads.length; i++){
            int a = roads[i][0];
            int b = roads[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        dfs(0,-1, adj,seats);
        return fuel;

    }

    public int dfs (int node, int parent, List<List<Integer>> adj , int seats){

        int representative = 1;
        for (int city: adj.get(node)){

            if (city != parent){

                representative += dfs(city, node, adj, seats );
            }
        }

        if (node!=0)
            fuel += Math.ceil((double) representative / seats);
        
        return representative;

    }
}