class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        for (int i= nums.length-1; i>=2; i--){
            
            int peri = nums[i] + nums[i-1] + nums[i-2];
            
            if (nums[i-2] + nums[i-1] > nums[i])
                return peri;
        }
        
        return 0;
    }
}