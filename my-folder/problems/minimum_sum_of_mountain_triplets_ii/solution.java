class Solution {
    public int minimumSum(int[] nums) {
        
        int [] minarray = new int[nums.length];
        minarray[0] = nums[0];
        for (int i = 1; i <nums.length; i++){
            minarray[i] = Math.min(nums[i], minarray[i-1]);
        }
        
        int ans = Integer.MAX_VALUE;
        
        Stack<Integer> st = new Stack<>();
        st.push(nums[nums.length-1]);
        for (int j = nums.length - 2; j>0; j--){
            
            while (!st.isEmpty() && st.peek() >= nums[j]){
                st.pop();
                
            }
            
            if (!st.isEmpty()){
                if (nums[j] > minarray[j])
                    ans = Math.min (ans, st.peek()+nums[j] + minarray[j]);
            }
            
            else
                st.push(nums[j]);
        }
        
        return (ans == Integer.MAX_VALUE ? -1 : ans);
        
    }
}