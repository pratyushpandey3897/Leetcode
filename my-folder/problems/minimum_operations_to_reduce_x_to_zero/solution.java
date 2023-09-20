class Solution {
    public int minOperations(int[] nums, int x) {
        
        int left = 0, right = 0;
        int total_sum = 0;
        for (int n: nums)
            total_sum += n;
        
        if (total_sum == x) return nums.length;

        int t_sum = total_sum - x;
        int max_len = 0, cur_sum = 0;

        while (right < nums.length){
            cur_sum += nums[right];
            
                
            if (cur_sum > t_sum){
                while (cur_sum > t_sum && left <= right)
                    {
                     cur_sum -= nums[left];
                     left++;
                    }
                
            } 
            if (cur_sum == t_sum) {
                max_len = Math.max(right - left +1 , max_len);
                
            }
            right++;

        }

        if (max_len == 0)
            return -1;
        
        return nums.length - max_len;

    }
}