class Solution {
    public boolean exist(char[][] board, String word) {
        
        boolean flag = false;

        int [][] visited = new int[board.length][board[0].length];
        for (int i = 0; i< board.length; i++){

            for (int j =0; j< board[0].length; j++){

                if (board[i][j] == word.charAt(0)){
                    
                   if (dfs (board, i, j, word, 0, visited))
                        return true;
                //    || 
                //     dfs (board, i, j-1, word, 1, visited) || 
                //     dfs (board, i+1, j, word, 1, visited) || 
                //     dfs (board, i, j+1, word, 1, visited));
                }
            }
            System.out.println(flag);
            if (flag == true)
            break;
        }

        return flag;
        
    }

    public boolean dfs (char[][] board, int i, int j, String word, int wrd_idx, int[][] visited){

        if (wrd_idx == word.length())
                return true;

        if (i==board.length|| i < 0 || j== board[0].length|| j < 0 || board[i][j] != word.charAt(wrd_idx)){
            return false;
        }

            char temp = board[i][j];
            board [i][j] = '#';
            if (wrd_idx == word.length() -1)
                return true;
            
        boolean ans1 = dfs (board, i-1, j,word, wrd_idx+1, visited); 
        boolean ans2 = dfs (board, i, j-1,word, wrd_idx+1, visited); 
        boolean ans3 = dfs (board, i+1, j,word, wrd_idx+1, visited); 
        boolean ans4 = dfs (board, i, j+1,word, wrd_idx+1, visited);
        board[i][j] = temp;

        return ans1 || ans2 || ans3 || ans4;
    }
}