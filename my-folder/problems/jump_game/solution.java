class Solution {
    public boolean canJump(int[] nums) {
        
        
        int jumpsLeft = nums[0];
        for (int i=1; i< nums.length; i++){
            
            if (jumpsLeft==0 )
                return false;
            
            // we find if we have maximum jumps to land here
            jumpsLeft = Math.max(nums[i], jumpsLeft-1);
            
        }
        
        return true;
    }
}