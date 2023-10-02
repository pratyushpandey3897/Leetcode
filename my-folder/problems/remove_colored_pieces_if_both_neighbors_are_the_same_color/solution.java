class Solution {
    public boolean winnerOfGame(String colors) {
        StringBuilder sb = new StringBuilder(colors);
        int aturn = 0, bturn = 0;
            for (int i = 1 ; i < sb.length()-1 ; i++){
                
                    if (sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i) == sb.charAt(i+1)){

                        if (sb.charAt(i) == 'A'){
                            aturn ++;

                        } else {
                            bturn ++;
                        }
                    } 
                } 
        
        

        return (aturn > bturn);
    }
}