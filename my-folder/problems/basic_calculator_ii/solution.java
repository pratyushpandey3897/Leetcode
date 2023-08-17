class Solution {
    public int calculate(String s) {

        Stack<Integer> st = new Stack<>();
        int currNum = 0;
        int ans = 0;
        char operation = '+';
        for (int i = 0; i< s.length(); i ++){
            char currChar = s.charAt(i);

            if (Character.isDigit(currChar)){
                currNum = (currNum*10) + (currChar - '0');
            }


            if (!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == s.length()-1) {

                if (operation == '-')
                    st.push(-currNum);
                
                else if (operation == '+')
                    st.push(currNum);
                else if (operation == '*')
                    st.push(st.pop() * currNum);
                else if (operation == '/')
                    st.push(st.pop() / currNum);

                operation = currChar;
                currNum = 0;
            }

        }

        while (!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    
        
    }
}