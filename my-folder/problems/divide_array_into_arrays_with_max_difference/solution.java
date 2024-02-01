class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        int ptr1 = 0, ptr2 = 2;
        if (nums.length < 3)
            return new int[][]{};

        ArrayList<int[]> ans = new ArrayList<>();
        while (ptr2 < nums.length){
            if (nums[ptr2] - nums[ptr1] <= k ){
                ans.add(new int[] {nums[ptr1], nums[ptr1+1], nums[ptr2]});
                ptr1 = ptr2+1;
                ptr2 = ptr2+3;
            } else {
                return new int[][]{};
            }

        }

        return ans.stream().toArray(int[][]::new);
    }
}