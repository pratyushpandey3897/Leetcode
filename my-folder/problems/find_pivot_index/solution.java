class Solution {
    public int pivotIndex(int[] nums) {
        
        int lSum =0, rSum = 0;
        
        // calculate the total sum and consider it as right sum
        for (int  i = 0; i< nums.length; i ++){
            rSum += nums[i];
        }
            
        for (int i= 0; i< nums.length; i++){
            
            rSum -= nums[i];
            if (lSum == rSum)
                return i;
            lSum += nums[i];
        }
        
        return -1;
    }
}