class Solution {
    // Bottom Up, memoization method
//     public int maxResult(int[] nums, int k) {
//         int [] dp = new int[nums.length];
//         Arrays.fill(dp, Integer.MIN_VALUE);
//         dp[0] = nums[0];
//         for(int i = 1; i < nums.length; i++) {
//             for(int j = 1; j <= k && i - j >= 0; j++)  {    // try all jumps length
//                 dp[i] = Math.max(dp[i], dp[i - j] + nums[i]);   // choose the jump from previous index which maximises score       
//             }
//         }
//         return dp[nums.length-1];
// }

public int maxResult(int[] nums, int k) {
        int n = nums.length;

        int max = nums[0];
        // first value in PQ is index, second value is the maximum sum
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]); // sorting this on the basis of maximum in decreasing order, since PQ is by defaulty increasing
        pq.offer(new int[]{0, nums[0]});
        for (int i=1; i< n; i++){

            while (i- pq.peek()[0] > k){
                pq.poll();
            }

            int top[] = pq.peek();
            max = nums[i] + top[1];
            pq.offer(new int[]{i,max});
        }
        return max;

}
    
}