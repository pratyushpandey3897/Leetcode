import java.util.*;
class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 1)
            return nums[0];
        
        int[] houseHeist = new int[nums.length];
        
        houseHeist[0] = nums[0];
        houseHeist[1] = nums[1];
        
        for (int i = 2; i< nums.length; i++){
            
            int oneSkipRob = nums[i] + houseHeist[i-1] - nums[i-1];
            int twoSkipRob = nums[i] + houseHeist[i-2];
            
            if (oneSkipRob > twoSkipRob)
                houseHeist[i] = oneSkipRob;
            else
                houseHeist[i] = twoSkipRob;
        }
        
        return (houseHeist[nums.length-1] > houseHeist[nums.length-2] ? houseHeist[nums.length-1]: houseHeist[nums.length-2]);
    }
}