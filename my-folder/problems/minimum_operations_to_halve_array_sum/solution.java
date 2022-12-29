class Solution {
    public int halveArray(int[] nums) {
        
        PriorityQueue<Double> q = new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;
        for (int i =0; i< nums.length; i++){
            q.add((double)nums[i]);
            sum += nums[i];
        }

        double initSum = sum;
        int operations = 0;

        while(sum > initSum/2 ){
            operations++;

            double ele = q.poll();
            ele = ele/2;
            q.add(ele);

            sum = sum - ele;
        }

        return operations;
    }
}