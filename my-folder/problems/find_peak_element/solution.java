class Solution {
    public int findPeakElement(int[] nums) {
        
        // for (int i = 0; i< nums.length-1; i++){

        //     if ( nums[i] > nums[i+1])
        //         return i;
        // }

        // return nums.length-1;


        //binary search 
        int left = 0, right = nums.length-1;
        while (left < right){
            int mid = (left + right )/2;
            if (nums[mid] > nums[mid+1]){
                right = mid;
            } else {
                left = mid+1;
            }

        }

        return right;
        // return binarysearch(nums, 0, nums.length-1);
    }

    public int binarysearch (int[] nums, int left, int right ){
        if (left == right)
            return left;
        int mid = (left+right)/2;
        if (nums[mid] > nums[mid+1])
            return binarysearch(nums, left, mid);
        
        return binarysearch(nums, mid+1, right);
    }
}