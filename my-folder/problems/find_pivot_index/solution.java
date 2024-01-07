class Solution {
    public int pivotIndex(int[] nums) {
        int lsum[] = new int [nums.length];
        int rsum[] = new int [nums.length];

        for (int i=1, j = nums.length-2; i< nums.length && j>=0; i++,j--){
            lsum[i] = lsum[i-1] + nums[i-1];
            rsum[j] = rsum[j+1] + nums[j+1];

        }

        for (int i = 0;i < nums.length; i++){
            if (lsum[i] == rsum[i])
                return i;
        }

        return -1;
        
    }
}