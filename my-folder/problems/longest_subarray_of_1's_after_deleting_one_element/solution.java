class Solution {
    public int longestSubarray(int[] nums) {
        
        int lptr = 0 ;
        int rptr = 0;
        int lenmax= 0;
        int zerctr = 0;
        while (rptr < nums.length){
            if (nums[rptr] == 0)
                zerctr ++;
            if (zerctr > 1){
                while (nums[lptr]!=0)
                    lptr++;
                zerctr--;
                lptr++;
            }
            lenmax = Math.max(rptr-lptr, lenmax);
            rptr++;
        }

        return lenmax;
    }
}