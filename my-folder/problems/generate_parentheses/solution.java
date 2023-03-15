class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        recursion(ans, new StringBuilder(), n, 0, 0 );
        return ans;
    }

    public void recursion(List<String> ans, StringBuilder curr, int n, int ob, int cb){

        if (curr.length() == n*2){
            ans.add(curr.toString());
            return;
        }

        if (ob < n){
            curr.append("(");
            recursion(ans, curr, n, ob+1, cb);
            curr.deleteCharAt(curr.length()-1); // backtrack
        } 
        if  (cb < ob){
            curr.append(")");
            recursion(ans, curr, n, ob, cb+1);
            curr.deleteCharAt(curr.length()-1); // backtrack
        }

    }
}