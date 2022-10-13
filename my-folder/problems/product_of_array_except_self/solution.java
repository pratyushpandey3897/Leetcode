class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] arr = new int[nums.length];
        int rightSum = 1;
        int leftSum = 1;
        for (int i=0; i<nums.length ; i++){
            arr[i] = rightSum;
            rightSum *= nums[i];
        }
        
        for (int i =nums.length-1;i>=0; i--){
            arr[i] *= leftSum;
            leftSum *= nums[i];
        }
        
        return arr;
        

    }
}