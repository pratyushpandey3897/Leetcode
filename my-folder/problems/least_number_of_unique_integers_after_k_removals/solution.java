class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.add(new Integer[]{e.getKey(), e.getValue()});
        }

        while (k >0 && !pq.isEmpty()){
            Integer [] a = pq.peek();
            if (k >= a[1])
            {
                pq.poll();
                k = k - a[1];
            } else {
                pq.poll();
                pq.add(new Integer[] {a[0], a[1]-k});
                k = k - a[1];
            }
            

        }

        return pq.size();
    }
}