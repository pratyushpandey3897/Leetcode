class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double avg = Integer.MIN_VALUE;
        int left = 0; 
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];

            if (i >= k-1){
                avg = Math.max(avg,sum);
                sum -= nums[left];
                left++;
            }
        }

        return (double)avg/k;
    }
}