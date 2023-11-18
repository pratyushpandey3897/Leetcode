class Solution {
    public String decodeString(String s) {
        
        Stack<Character> st = new Stack<>();

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == ']'){
                
                List<Character> decodedSList = new LinkedList<>();
                while (st.peek()!='['){
                    decodedSList.add(st.pop());
                }

                st.pop(); // popping[ bracket

                // get the number 
                int k = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek()) ){
                    k += (st.pop() - '0') *base;
                    base *= 10;
                }

                while (k>0){
                    for (int l = decodedSList.size()-1; l>=0; l--){
                        st.push(decodedSList.get(l));
                    }
                    k--;
                }
            }

            else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        int sz = st.size();
        for (int i  = 0; i<sz; i++){
            ans = ans.reverse().append(st.pop()).reverse();
            
        }

        return ans.toString();

    }
}