class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int province = 0;
        // for (int i= 0; i< isConnected.length; i++){
            
        //     for (int j= 0; j<isConnected[0].length; j++){
                
        //         if (isConnected[i][j] == 1){
        //             dfs(isConnected,i, j);
        //             province++;
        //         }
        //     }
        // }
        // return province;


        boolean visit[] = new boolean[isConnected.length];
        

        for (int i=0; i<isConnected.length; i++){
            if (!visit[i]){
                province++;
                // dfs(i,isConnected, visit);
                bfs(i , isConnected, visit);
            }
        }
        return province;
    }
    
    void dfs (int node, int[][] isConnected, boolean [] visit){

        
        visit[node] = true;
        for (int i =0; i<isConnected.length; i++){
            if (isConnected[node][i] ==1 && !visit[i])
                dfs(i, isConnected, visit);
        }

    }


    void bfs (int node, int [][] isConnected, boolean[] visit ) {
        Queue<Integer> connNode = new LinkedList<>();
        connNode.offer(node);
        visit[node] = true;

        while (!connNode.isEmpty()){
            node = connNode.poll();

            for (int i=0; i< isConnected.length; i++){
                if (isConnected[node][i] == 1 && !visit[i]){
                    connNode.offer(i);
                    visit[i] = true;
                }
            }
        }

    }
    // public void dfs(int [][] isConnected, int i,int j){
        
    //     if (i > isConnected.length-1 || j >isConnected[0].length-1 || isConnected[i][j] == 2)
    //         return;
    //     isConnected[i][j]=2;
    //     isConnected[j][i]=2;
    //     for (int p =0; p<isConnected[j].length ; p++){
            
    //         if (isConnected[j][p] == 1){
    //             dfs(isConnected,j ,p);
            
    //         }
    //     }
        
        
    // }
}