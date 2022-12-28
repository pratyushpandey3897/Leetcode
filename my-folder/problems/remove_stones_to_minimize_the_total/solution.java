class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        for (int p: piles){
            pQueue.add(p);
        }

        while(k>0){
            int ele = pQueue.poll();
            ele = ele - (ele/2);
            pQueue.add(ele);
            k--;
        }

        int res = 0;
        Iterator<Integer> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            res += itr2.next();

        return res;
    }
}