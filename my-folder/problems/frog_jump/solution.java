class Solution {
    Map<Integer, Integer> mark = new HashMap<>();
    int dp[][] = new int[2001][2001];
    public boolean canCross(int[] stones) {

        
        for (int i =0 ;i <stones.length ; i++){
            mark.put(stones[i] , i);
        }

        for (int i = 0; i < 2000; i++) {
            Arrays.fill(dp[i], -1);
        }

        
        return recurse(stones, 0, 0);
       
    }

    public boolean recurse (int []stones, int idx, int prevJump){
        int [] jumps = {-1,0,1};

        if (idx == stones.length - 1)
            return true;

        if (dp[idx][prevJump] != -1)
            return dp[idx][prevJump] == 1 ? true : false;

        boolean ans = false;
        for (int jump : jumps){
            int next = prevJump + jump;

            if (next > 0 && mark.containsKey(stones[idx] + next)){
                ans = ans || recurse(stones, mark.get(stones[idx] + next) , next);
            }
        }

        dp [idx][prevJump] = (ans ? 1: 0);
        return ans;

    }
}