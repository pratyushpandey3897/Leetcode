class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int b = 0;
        int cnt = 0;
        
        for (int n : nums){
            b += n;
            if (b == 0)
                cnt++;
        }
        return cnt;
    }
}