class Solution {
    public int singleNumber(int[] nums) {

        if (nums.length == 1 || nums.length == 2)
            return nums[0];

        Arrays.sort(nums);
        int i =0;
        
        
        while (i <nums.length){
            int num1 = nums[i]; 
            int num2;
            if (i+2 < nums.length)
                num2 = nums[i+2];
            else
                return num1;

            if (num1 == num2){
                i+=3;
            } else {
                return num1;
            }
                
        }

        return nums[0];
    }
}