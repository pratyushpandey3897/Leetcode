class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int [] res = {-1,-1};
        
        int low = 0, high = nums.length-1;
        
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid] == target){
                res[0] = mid;
                high = mid-1;
                
            } else if (target>nums[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        low = 0; high = nums.length-1;
        
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid] == target){
                res[1] = mid;
                low = mid+1;
                
            } else if (target>nums[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        
        return res;
    }
    
    
}