class Solution {
    public int rob(int[] nums) {
        
        
            return Math.max(nums[0], Math.max(robMax(1, nums.length, nums), robMax(0,nums.length-1,nums)));
        
        
    }
    
    public int robMax(int start, int end, int[] nums) {
        
        int rob1 =0, rob2 = 0;
        for (int i =start; i<end; i++){
            
            int maxrob = Math.max(nums[i]+rob1 , rob2);
            rob1 = rob2;
            rob2 = maxrob;
            
        }
            return rob2;
        
    }
    
    
}