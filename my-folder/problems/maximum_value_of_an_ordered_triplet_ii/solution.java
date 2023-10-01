class Solution {
    public long maximumTripletValue(int[] nums) {
        
        int max[] = new int[nums.length];
        long ans = Long.MIN_VALUE;
        Stack<Integer> kst = new Stack<>();
        max[0] = nums[0];
        for (int i =1 ;i <nums.length; i++){
            max[i] = Math.max(nums[i], max[i-1]);
            System.out.println(max[i]);
        }
        
        kst.push(nums[nums.length-1]);
        for (int i =nums.length-2 ;i >=0; i--){
            
            
            // System.out.println(nums[i]);
            ans = (ans >((long)(max[i] - nums[i]) * kst.peek()) ) ? ans : ((long)(max[i] - nums[i]) * kst.peek());
            
            if (nums[i] > kst.peek())
                kst.push(nums[i]);
            
        }
        
        
        
        if (ans < 0)
            return 0;
        return ans;
        
        
        
        
    }
}