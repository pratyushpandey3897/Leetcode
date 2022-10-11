class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        
        if (nums.length <3)
            return false;
        
        int pointer2 = Integer.MAX_VALUE;
        int pointer1 = Integer.MAX_VALUE;
        
        for (int i = 0; i< nums.length; i++){
            if (nums[i] <= pointer1)
                pointer1 = nums[i];
            else if (nums[i] <= pointer2)
                pointer2 = nums[i];
            else 
                return true;
        }
        return false;
    }
}