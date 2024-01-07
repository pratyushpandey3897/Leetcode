class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        int lstart = intervals[0][0];
        int lend = intervals[0][1];
        int idx = 0;
        l.add(new int[]{lstart,lend});

        for (int i =1; i<intervals.length; i++){
            if (intervals[i][0] <= lend){
                lend = Math.max(intervals[i][1], lend);
                l.set(idx, new int[]{lstart,lend});
                
            } else {
                lstart = intervals[i][0];
                lend = intervals[i][1];
                idx++;
                l.add(new int[]{lstart,lend});
            }
        }

        int [][] ans = new int[l.size()][];
        for (int i =0 ; i< l.size(); i++ ){
            ans[i] = l.get(i);
        }
        return ans;
    }
}