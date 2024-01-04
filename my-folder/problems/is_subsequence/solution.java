class Solution {
    public boolean isSubsequence(String s, String t) {

        int ptrs = 0, ptrt = 0;

        while (ptrt < t.length() && ptrs<s.length()){
            if (s.charAt(ptrs) == t.charAt(ptrt)){
                ptrs++;
                ptrt++;
            } else {
                ptrt++;
            }
        }

        return (ptrs == s.length());
        
    }
}