class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i <9; i+=3){
            Boolean validBoxFlag = validBox(board, i, 0) && validBox(board, i, 3) && validBox(board, i, 6);
            
            if (validBoxFlag)
                continue;
            else
                return false;
        }
        return validRows(board);
    }  
    
    static Boolean validBox(char[][] board, int i, int j){
        HashSet<Character> set = new HashSet<>();
        
        for(int r =i ;r<=i+2; r++){
            for (int c = j; c<=j+2; c++){
                
                if (board[r][c] != '.'){
                    if (set.contains((char)board[r][c])) {
                        return false;
                    }
                    else
                        set.add(board[r][c]);
                }
            }
        }
        
        return true;
    }
    
    static Boolean validRows(char[][] board){
        
        
        for(int r =0 ;r<9; r++){
            HashSet<Character> setHoriz = new HashSet<>();
            HashSet<Character> setVertic = new HashSet<>();
            
            for (int c = 0; c<9; c++){
                if (board[r][c] != '.'){
                    if (setHoriz.contains(board[r][c])){
                        System.out.println("here");
                        return false;
                    }
                    else{
                        setHoriz.add(board[r][c]);
                    }
                        
                }
                
                if (board[c][r] != '.'){
                    
                    if (setVertic.contains(board[c][r]))
                        return false;
                    else
                        setVertic.add(board[c][r]);
                }
                
            }
        }
        
        return true;
    }
    
    
}