class Solution {
    public int findKOr(int[] nums, int k) {
        
        int[] bits = new int[32];
        int ans = 0;
        
        for (int num : nums){
            for (int i= 0; i<32; i++){
                if ((num & (1<< i) ) != 0){
                    bits[i]++;
                }
            }
        }
        
        for (int i= 0; i< 32;i ++){
            if (bits[i] >= k){
                ans |= (1<<i);
            }
        }
        
        return ans;
    }
}