class Solution {
    public void sortColors(int[] nums) {

        int ptrl = 0,  ptrr = nums.length-1, curr = 0;

        while (curr<=ptrr){
            if (nums[curr] == 0){
                int temp = nums[ptrl];
                nums[ptrl] = nums[curr];
                nums[curr] = temp;
                ptrl++;
                curr++;
            } else if (nums[curr] == 2) {
                int temp = nums[ptrr];
                nums[ptrr] = nums[curr];
                nums[curr] = temp;
                ptrr--;
            } else {
                curr++;
            }
        }

        return;
        
    }
}