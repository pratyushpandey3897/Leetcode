class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if (n <=2)
            return n;

        int prev= 1;
        for (int curr =2; curr<n; curr++){
            if (nums[curr] == nums[prev] && nums[curr] == nums[prev-1]){
                continue;
            }
            else 
            {
                prev++;
                nums[prev] = nums[curr];
                
            }
        }

        return prev+1;
    }
}