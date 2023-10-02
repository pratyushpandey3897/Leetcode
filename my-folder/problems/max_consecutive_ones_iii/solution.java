class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0, curzero = 0;
        int maxlen = 0;
        int ans = 0;

        for (int i =0 ; i<nums.length; i++){
            if (nums[i] == 1){
                maxlen++ ;
            } else if (nums[i] == 0 ){
                if ((k-curzero > 0)) {
                maxlen++;
                curzero++;
                } else {
                    while(nums[left] !=0){
                        left++;
                        maxlen--;
                    }
                    left++;
                }
            } 
            ans = Math.max(ans, maxlen);
        }
        return ans;
    }
}