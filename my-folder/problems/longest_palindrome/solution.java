class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        
        int palLen = 0;
        
        for (int i =0 ; i< s.length(); i++){
            if ( !hs.contains(s.charAt(i)) ){
                hs.add(s.charAt(i));
            } else {
                palLen += 2;
                hs.remove(s.charAt(i));
            }
        }
        
        if (!hs.isEmpty())
            palLen++;
        
        
        return palLen;
        
    }
}