class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int prevEle = nums[0];
        for (int i =1; i<nums.length; i++){
            if (nums[i] == prevEle)
                continue;
            else{
                nums[k++] = nums[i];
                prevEle = nums[i];
                
            }
        }
        
        return k;
        
    }
}