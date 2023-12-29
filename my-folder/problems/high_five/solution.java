class Solution {
    public int[][] highFive(int[][] items) {

        Map<Integer,List<Integer>> marks = new HashMap<>();

        for (int[] x : items){
            int stid = x[0];
            int stmark = x[1];
            marks.computeIfAbsent(stid, k -> new ArrayList<>()).add(stmark);
        }

        int[][] ans = new int[marks.size()][2];

        int stdidx = 0;
        for (Map.Entry<Integer, List<Integer>> entry : marks.entrySet()){
            Collections.sort(entry.getValue(), Collections.reverseOrder());
            int totalmarks = 0;
            for (int i =0 ; i< 5; i++)
                totalmarks+=entry.getValue().get(i);
            
            ans[stdidx][0] = entry.getKey();
            ans[stdidx][1] = totalmarks/5;  
            stdidx++;
        }
        Arrays.sort(ans, (a,b)-> Integer.compare(a[0],b[0]));
        return ans;
    }
}