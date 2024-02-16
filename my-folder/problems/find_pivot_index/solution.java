class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for (int a: nums)
            totalsum +=a;
        int psum = 0;
        for (int i = 0;i < nums.length; i++){
            if (psum == totalsum - nums[i] -psum)
                return i;
            psum += nums[i];
        }

        return -1;
        
    }
}