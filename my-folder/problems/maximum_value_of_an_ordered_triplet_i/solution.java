class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = Long.MIN_VALUE;
        for (int i = 0; i <nums.length -2; i++){
            for (int j = i+1; j< nums.length-1; j++){
                for (int k = j+1; k<nums.length; k++){
                    ans = (ans > ((long)(nums[i] - nums[j]) * nums[k]))  ? ans : ((long)(nums[i] - nums[j]) * nums[k]) ;
                }
            }
        }
        
        if (ans < 0)
            return 0;
        return ans;
        
    }
}