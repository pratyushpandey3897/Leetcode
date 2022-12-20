class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c: chars){
            if (!st.isEmpty() && st.peek() == c)
                st.pop();
            else
                st.add(c);
        }

        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
        
    }
}