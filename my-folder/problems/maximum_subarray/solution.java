import java.util.*;
class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int max_sum_here = nums[0];
        
        for (int i= 1; i< nums.length; i++){
            int sum = max_sum_here + nums[i];
            if (sum > nums[i])
                max_sum_here = sum;
            else max_sum_here = nums[i];
            
            if (max_sum_here > maxSum)
                maxSum = max_sum_here;
        }
        
        return maxSum;
        
        
    }
    
}