class Solution {
    public int maxEvents(int[][] events) {
        int n= events.length;
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[]a, int[] b){
                if (a[0] == b[0])
                    return a[1] - b[1];
                
                return a[0]-b[0];
            }
        }); // sort by end time

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

        int day = 0;
        int cnt = 0;
        for (int i =0; i< events.length || !pq.isEmpty(); ){
            if (pq.isEmpty()){
                day = events[i][0];
            }
            while (i<n && day == events[i][0]){
                pq.add(events[i]);
                i++;
            }

            pq.poll();
            day++;
            cnt++;
            while(!pq.isEmpty() && day > pq.peek()[1])
                pq.poll();
            
            
        }

        return cnt;
    }
}