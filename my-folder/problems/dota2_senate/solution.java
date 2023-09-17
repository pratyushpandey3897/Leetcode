class Solution {
    public String predictPartyVictory(String s) {
        Queue<Character> q= new LinkedList<>();
        Set<Character> set= new HashSet<>();
        int rcount = 0, dcount = 0;
        int rban = 0, dban = 0;
        for (char c : s.toCharArray()){
            if(c == 'D') dcount++;
            else rcount++;
            q.offer(c);
        }

        
        while (q.size() != 1 && rcount != 0 && dcount !=0){
            char snt = q.peek();
            if (snt == 'D'){
                if (dban > 0){
                    q.poll();
                    dban--;
                    dcount--;
                } else {
                    q.offer(q.poll());
                    rban++;
                }
            } else {
                if (rban>0){
                    q.poll();
                    rban--;
                    rcount--;
                } else {
                    q.offer(q.poll());
                    dban++;
                }
            }
        }

        if (dcount == 0)
            return "Radiant";

        return "Dire";

    }
}