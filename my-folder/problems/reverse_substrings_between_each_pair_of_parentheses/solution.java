class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()){
            if (c!= ')')
                st.push(c);

            else if (c == ')'){
                String curstr ="";
                while(st.peek()!= '('){
                    curstr += st.pop();
                }

                // remove the opening bracket 
                st.pop();

                for (char curStrChar : curstr.toCharArray()){
                    st.push(curStrChar);
                }
            }
        }

        String ans = "";
        while (!st.isEmpty()){
            ans = st.pop()+ans;
        }

        return ans;
    }
}