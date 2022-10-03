class Solution {
    public int[][] merge(int[][] intervals) {
        

        List<int[]> mergedVal = new ArrayList<int[]>();
        
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int latestStartTime = intervals[0][0];
        int latestFinishTime = intervals[0][1];
        int mergerdValIndex = 0;
        
        mergedVal.add(new int[]{latestStartTime, latestFinishTime});
        for(int i =1; i<intervals.length; i++){
           if (intervals[i][0] <= latestFinishTime) { // overlap'
              mergedVal.set(mergerdValIndex, new int[]{latestStartTime, Math.max(intervals[i][1], latestFinishTime)});
              latestFinishTime = mergedVal.get(mergerdValIndex)[1];
           } else { // non overlap
               mergedVal.add(new int[]{intervals[i][0], intervals[i][1]});
               latestFinishTime = intervals[i][1];
               latestStartTime = intervals[i][0];
               mergerdValIndex++;
           }
        }
        
        int [][] m = new int[mergedVal.size()][2];
        for (int i =0; i< mergedVal.size(); i++){
            m[i] = mergedVal.get(i);
        }
        
        return m;
    }
}