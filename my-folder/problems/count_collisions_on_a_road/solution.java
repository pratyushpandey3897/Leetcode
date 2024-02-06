class Solution {
    public int countCollisions(String directions) {
        
        Stack<Character> s = new Stack<>();
        int coll = 0;  // 2
        //RLRSLL   RL
        for (int i = 0; i<directions.length(); i++){
            char curr = directions.charAt(i);
            if (!s.isEmpty()){
                
                
                if (s.peek() != curr){
                    if (s.peek() == 'R' && curr == 'L'){
                        coll+=2;
                        s.pop();
                        while (!s.isEmpty() && s.peek()== 'R')
                            {
                                coll++;
                                s.pop();
                            }
                        s.push('S');
                    } else if (s.peek() == 'R'  && curr == 'S'){
                        while (!s.isEmpty() && s.peek()== 'R')
                            {
                                coll++;
                                s.pop();
                            }
                        s.push(curr);
                    } else if (s.peek() == 'S' && curr == 'L'){
                        coll+=1;
                        s.push('S');
                    } else{
                        s.push(curr);
                    }
                } 
                else s.push(curr);
                
                
            } else {
                s.push(curr);
            }
        }
        
        return coll;
    }
}