class Solution {
    public boolean find132pattern(int[] nums) {
        int minarr [] = new int [nums.length];
        Stack<Integer> kstack  = new Stack<>();
        minarr[0] = nums[0];
        for (int i =1 ;i <nums.length; i++){
            minarr[i] = Math.min(minarr[i-1] , nums[i]);
        }

        for (int i = nums.length -1; i>=0; i--){
            int numsj = nums[i];
            if (numsj > minarr[i]) {
                while (!kstack.isEmpty() && kstack.peek() <= minarr[i] ){
                    kstack.pop();
                }
                if (!kstack.isEmpty() &&  numsj > kstack.peek()  )
                    return true;
                kstack.push(numsj);
                
            }
        }

        return false;
        
    }
}