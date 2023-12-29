class Solution {
    public int maxSubArray(int[] nums) {
        
        // int max = Integer.MIN_VALUE;

        // brute
        // for (int i = 0; i< nums.length; i ++){
        //     int currsum = 0;
        //     for (int j = i; j< nums.length; j++){
        //         currsum += nums[j];
        //         max = Math.max(currsum, max);
        //     }
        // }

        //kadane

        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i<nums.length;i++){

            int a = nums[i];
            currsum = Math.max(currsum+a, a);
            maxsum = Math.max(currsum, maxsum);
        }


        return maxsum;
    }
}