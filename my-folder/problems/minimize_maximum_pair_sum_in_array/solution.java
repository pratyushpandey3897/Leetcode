class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);

        int ptrleft= 0, ptrright= nums.length-1;
        int maxsum = Integer.MIN_VALUE;

        while (ptrleft < ptrright){
            maxsum = Math.max(nums[ptrleft]+nums[ptrright], maxsum);
            ptrleft ++;
            ptrright--;
        }

        return maxsum;
        
    }
}