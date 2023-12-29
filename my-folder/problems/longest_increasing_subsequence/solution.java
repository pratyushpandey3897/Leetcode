class Solution {
    public int lengthOfLIS(int[] nums) {

        int [] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i< nums.length; i++){

            for (int j = i; j>=0; j--){
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }

        Arrays.sort(dp );
        return dp[dp.length -1];
        
    }
}