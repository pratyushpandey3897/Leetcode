class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int province = 0;
        for (int i= 0; i< isConnected.length; i++){
            
            for (int j= 0; j<isConnected[0].length; j++){
                
                if (isConnected[i][j] == 1){
                    dfs(isConnected,i, j);
                    province++;
                }
            }
        }
        return province;
    }
    
    public void dfs(int [][] isConnected, int i,int j){
        
        if (i > isConnected.length-1 || j >isConnected[0].length-1 || isConnected[i][j] == 2)
            return;
        isConnected[i][j]=2;
        for (int p =0; p<isConnected[j].length ; p++){
            
            if (isConnected[j][p] == 1){
                dfs(isConnected,j ,p);
            
            }
        }
        
        
    }
}