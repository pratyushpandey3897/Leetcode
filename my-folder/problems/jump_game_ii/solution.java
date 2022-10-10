class Solution {
    public int jump(int[] nums) {
        int maxJump = 0;
        int jump =0;
        int position = 0;
        
        for (int i = 0; i<nums.length-1; i++){
            
            if (nums[i] + i > maxJump){
                maxJump = nums[i]+i;
            }
            
            if (i == position){
                position = maxJump; // we jump to the maximium tile we can
                jump++;
            }
        }
        
        return jump;
        
    }
}