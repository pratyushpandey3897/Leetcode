class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        if (s.length() != t.length())
            return false;
        
        for (int i =0; i < s.length(); i++){
            if (sMap.containsKey(s.charAt(i))){
                if (sMap.get(s.charAt(i)) == t.charAt(i))
                    continue;
                else
                    return false;
            } else{
                if (tMap.containsKey(t.charAt(i)))
                    return false;
                else{
                    sMap.put(s.charAt(i), t.charAt(i));
                    tMap.put(t.charAt(i), s.charAt(i));
                }
            }
        }
        
        return true;
        
    }
}