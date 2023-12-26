class Solution {
    public boolean judgeCircle(String moves) {
        
        int initx = 0;
        int inity = 0;
        

        for (char move: moves.toCharArray()){

            switch (move) {
                case 'R':
                    initx += 1;
                    
                    break;
                case 'L':
                    initx -= 1;
                    break;
                case 'U':
                    inity+=1;
                    break;
                case 'D':
                    inity-=1;
                    break;
            
                default:
                    break;
            }

            
        }
        if (initx == 0 && inity ==0)
                return true;
            return false;
    }
}