class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character,  Integer> occ = new HashMap<>();
        for (int i =0; i<s.length(); i++)
            occ.put(s.charAt(i), i);
        
        for (int i =0; i<s.length(); i++){
            char curr = s.charAt(i);
            if (!seen.contains(curr)) {

                while (!st.isEmpty() && curr<st.peek() && i < occ.get(st.peek())){
                    seen.remove(st.pop());
                }

                st.add(curr);
                seen.add(curr);
            }
        }

        StringBuilder sb = new StringBuilder();
        // for (char c : st){
        //     sb.append(c);
        //     // System.out.println(c);
        // }

        while(!st.isEmpty()){
            // sb.append(c);
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}