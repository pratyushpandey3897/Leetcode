class Solution {
    public int countHillValley(int[] nums) {
        
        int count = 0;
        int ptr1 = 0;
        
        
        for (int i = 1; i < nums.length-1; i++){
            
            if (nums[i] == nums[i+1]){
                continue;
            }
                
            if (nums[i] != nums[ptr1] && nums[i] != nums[i+1]){
                
                if (nums[i] > nums[i+1] && nums[i] > nums[ptr1])
                    count++;
                if (nums[i] < nums[i+1] && nums[i] < nums[ptr1])
                    count++;
                
                ptr1 = i;
            }
                
            
        }
        
        return count;
    }
}