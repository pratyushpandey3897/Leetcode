class Solution {
    public int findJudge(int n, int[][] trust) {
        
        
        int[] trustGained = new int[n+1];
        Arrays.fill(trustGained ,0);
        if (trustGained.length <= 2)
            return 1;
        for (int[] person : trust){
            trustGained[person[0]]--;
            trustGained[person[1]]++;
        }
        
        for (int i =0; i<trustGained.length ; i++){
            
            if (trustGained[i] == n-1)
                return i;
        }
        
        return -1;
    }
}