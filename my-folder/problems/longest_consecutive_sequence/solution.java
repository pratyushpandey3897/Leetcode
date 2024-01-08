class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> has = new HashSet<>();
        for (int num: nums){
            has.add(num);
        }
        int ans = 0;
        

        for (int i = 0; i< nums.length; i++){
            if (!has.contains(nums[i] -1)){
                int startnum = nums[i];
                int curstreak =1;

                while (has.contains(startnum + 1)){
                    curstreak++;
                    startnum = startnum+1;
                }

                ans = Math.max(ans, curstreak);
            }
        }
        return ans;
    }
}