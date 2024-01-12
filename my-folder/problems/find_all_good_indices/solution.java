class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        
        int[] left = new int[nums.length];
        int[] right = new int[ nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;
        for (int i =1, j = nums.length-2; i <nums.length; i++, j--){
            left[i] = nums[i-1] >=nums[i] ? left[i-1]+1:1; 
            right[j] = nums[j+1] >=nums[j] ? right[j+1]+1:1; 
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < right.length-1; i++) {
            if (left[i-1]>=k && right[i+1]>=k)
                ans.add(i);
        }

        return ans;

    }
}