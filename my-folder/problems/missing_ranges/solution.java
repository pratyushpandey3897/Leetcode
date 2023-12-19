class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums.length == 0){
            ans.add(Arrays.asList(lower,upper));
            return ans;
        }

        // if (lower < nums[0]){
        //     ans.add(Arrays.asList(lower, nums[0]-1));
        // }
        for (int i = 0; i<nums.length; i++){
            if (lower == nums[i])
                lower++;
            else {
                ans.add(new ArrayList<>(Arrays.asList(lower,nums[i]-1)));
                lower = nums[i] +1;
            }
        }


        if (nums[nums.length-1] < upper){
            ans.add(new ArrayList<>(Arrays.asList(nums[nums.length-1]+1, upper)));
        }

        return ans;
    }
}