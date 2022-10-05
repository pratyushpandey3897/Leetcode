class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sPointer = 0;
        for (int i= 0; i< t.length() && sPointer<s.length(); i++){
            if (t.charAt(i) == s.charAt(sPointer)){
                sPointer++;
            }
        }
        
        if (sPointer == s.length())
            return true;
        else
            return false;
    }
}