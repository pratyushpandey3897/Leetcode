class Solution {
    public String tictactoe(int[][] moves) {

        char [][] grid = new char[3][3];
        // x= 0 o = 1
        for (int i =0; i< moves.length; i++ ){

            int row = moves[i][0];
            int col = moves[i][1];

            grid[row][col] = (i%2 == 0) ? 'A' : 'B';    
        }

        for (int i =0; i<3; i++){
            if ((grid[i][0] == 'A' || grid[i][0] == 'B')  && grid[i][0] == grid[i][1] && grid[i][1]== grid[i][2])
                return (grid[i][0] == 'A') ? "A" : "B";

            if ((grid[0][i] == 'A' || grid[0][i] == 'B')  && grid[0][i] == grid[1][i] && grid[1][i]== grid[2][i])
                return (grid[0][i] == 'A') ? "A" : "B";
        }

        if ((grid[1][1] == 'A' || grid[1][1] == 'B')  && 
	   (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] || // check primary diagonal
		grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]))  // check secondary diagonal
		return grid[1][1] == 'A' ? "A" : "B";

        return moves.length == 9 ? "Draw" : "Pending";
        
    }
}