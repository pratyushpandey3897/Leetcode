class Solution {
    int [][] directions = {{0,1} ,{1,0}, {0,-1}, {-1,0}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    
        int colorOfStart = image[sr][sc];
        if (colorOfStart != color)
            dfs(image, sr,sc,color, colorOfStart);
        
        return image;
        
        
    }

    public void dfs (int[][] image, int i, int j, int color, int colorOfStart){

        if (i < 0 || i >= image.length || j<0 || j>= image[0].length || image[i][j] != colorOfStart )
            return;

        image[i][j] = color;

        for (int[] d: directions ){
            int ni = d[0] + i;
            int nj = d[1] + j;
            if (ni >=0 && ni <image.length && nj >= 0 && nj < image[0].length && colorOfStart == image[ni][nj] )
                dfs(image, ni, nj, color, colorOfStart);
        }
    }
}