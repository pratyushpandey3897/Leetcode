class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        Stack<Integer> st = new Stack<>();
        List<String> ans = new ArrayList<>();
        int ptr = 0;
        String push = "Push";
        String pop = "Pop";
        for (int i=1; i<=n && ptr<target.length ;i++){
            st.push(i);
            ans.add(push);
            while(!st.isEmpty() && st.peek() != target[ptr]){
                st.pop();
                ans.add(pop);
                ptr--;
            }
            ptr++ ;
        }

        return ans;

    }
}