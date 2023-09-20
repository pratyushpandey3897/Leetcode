class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = nums[0], fast = nums[nums[0]];

        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }

        int newptr = 0;

        while (true){
            slow = nums[slow];
            newptr = nums[newptr];
            if (slow == newptr)
                return slow;
        }


    }
}