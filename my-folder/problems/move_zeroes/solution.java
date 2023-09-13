class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;
        int left =0, right = 1;

        while (right < nums.length){
            if (nums[left] == 0 ){
                if (nums[right] != 0){
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                } else {
                    right++;
                }
                
                
            } else {
                left++;
                right = left +1;
            }
            
        }
        
    }
}