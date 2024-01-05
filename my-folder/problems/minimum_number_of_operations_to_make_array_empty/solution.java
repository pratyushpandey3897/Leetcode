class Solution {
    public int minOperations(int[] nums) {
        
        Arrays.sort(nums);
        int ops =0;
        int ptr1 = 0, ptr2 =0;
        for (; ptr2<nums.length; ptr2++){
            if (nums[ptr2] == nums[ptr1])
                continue;
            
            else {
                int freq = ptr2- ptr1;
                if (freq == 1) {
                    return -1;
                } else {
                    ops += Math.ceil((double)freq/3);
                }

                ptr1 = ptr2;
            }
        }

        if (nums[ptr2-1] == nums[ptr1]) {
                int freq = ptr2- ptr1;
                if (freq == 1) {
                    return -1;
                } else {
                    ops += Math.ceil((double)freq/3);
                }
        }

        return ops;
    }
}