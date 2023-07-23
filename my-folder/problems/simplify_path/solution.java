class Solution {
    public String simplifyPath(String path) {
        
        String [] ele = path.split("/");
        Stack<String> st = new Stack<>();

        for (String s : ele){
            if (s == "" || s.isEmpty() || s.equals("."))
                continue;
            else if (s.equals("..")){
                if (!st.isEmpty())
                    st.pop();
            }
            else 
                {
                    st.push(s);
                }

        }

        return "/" + String.join("/", st); 
    }
}