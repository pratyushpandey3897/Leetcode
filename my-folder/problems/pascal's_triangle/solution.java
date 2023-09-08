class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> l = new ArrayList<>();
        l.add(1);
        ans.add(l);

        for (int i = 1 ; i< numRows; i++){
            List<Integer> prev_row = ans.get(i-1);
            List<Integer> cur_row = new ArrayList<>();

            cur_row.add(1);

            for (int e = 1; e <i ; e ++ ){
                cur_row.add(prev_row.get(e-1) + prev_row.get(e));
            }

            cur_row.add(1);

            ans.add(cur_row);

        }

        return ans;
    }
}