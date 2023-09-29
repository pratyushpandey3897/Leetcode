class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = false;
        boolean  decrease = false;
        for (int i = 1 ; i< nums.length; i++){
            if (nums[i] > nums[i-1]){
                // monoton increasing
                if (decrease)
                    return false;
                increase = true;
            } else if (nums[i] < nums[i-1]){
                // monotone decrease
                if (increase)
                    return false;
                decrease = true;
            } else {
                //equal
                continue;
            }
        }

        return true;
    }
}