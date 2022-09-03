import java.util.*;
class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int n = nums.length;
//         return maxSubArraySum(nums, 0, n-1);
        
//     }
    
//     public int maxSubArraySum(int[] arr, int low, int high) {
        
//         if (low == high){
//             return arr[high];
//         }
        
//         int mid = (low + high)/2;
        
//         return Math.max(maxCrossinSum(arr, low, mid, high),
//                         Math.max(maxSubArraySum(arr, low, mid),
//                                  maxSubArraySum(arr, mid+1, high)));
            
        
        
//     }
    
//     public int maxCrossinSum(int[] arr, int low, int mid, int high) {
        
//         int sum = 0;
//         int left_sum = Integer.MIN_VALUE;
//         for (int i = mid; i >= low; i--) {
//             sum = sum + arr[i];
//             if (sum > left_sum)
//                 left_sum = sum;
//         }
        
//         sum = 0;
//         int right_sum = Integer.MIN_VALUE;
//         for (int i = mid+1; i <= high; i++) {
//             sum = sum + arr[i];
//             if (sum > right_sum)
//                 right_sum = sum;
//         }
        
//         int crossingSum = left_sum + right_sum;
        
//         return Math.max(Math.max(left_sum, right_sum), crossingSum);
        
//     }
    
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