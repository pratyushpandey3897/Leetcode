class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> l = new ArrayList<>();

        for (int i = 0 ; i<k ; i++){
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()] ){
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        l.add(nums[dq.peekFirst()]);

        for (int i = k; i< nums.length; i++){
            if (i - dq.peekFirst() == k )
                dq.pollFirst();
            
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            l.add(nums[dq.peekFirst()]);
        }

        return l.stream().mapToInt(Integer::intValue).toArray();

    }
}