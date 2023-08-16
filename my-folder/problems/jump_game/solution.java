class Solution {
    public boolean canJump(int[] nums) {
        
        
        int dist = 0;

        for (int i =0 ;i < nums.length; i++){
            if (i > dist)
                return false;
            dist = Math.max(dist, nums[i]+i);
        }
        
        
        return true;
    }
}