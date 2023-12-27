class Solution {
    public boolean isRobotBounded(String instructions) {
        int idx = 0;
        
        int initx = 0;
        int inity = 0;

        int [][] direction = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        for (char move: instructions.toCharArray()){
            switch(move){
                case 'G':
                    initx += direction[idx][0];
                    inity +=direction[idx][1];;
                    break;

                case 'L':
                    idx = (idx +3)%4;
                    break;

                case 'R':
                    idx = (idx +1)%4;
                    break;
            }
        }

        return (initx ==0 && inity ==0) || idx !=0;

        
    }
}