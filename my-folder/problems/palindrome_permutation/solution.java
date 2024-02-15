class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[26];
        for(char c: s.toCharArray()){
            map[c-'a'] = (map[c-'a'] + 1)% 2;
        }

        if (s.length() %2 == 0){
            for (int a : map){
                if (a == 1)
                    return false;
            }
        } else {
            int ctr = 0;
            for (int a : map){
                if (a == 1)
                    ctr++;
            }
            if (ctr > 1)
                return false;
        }
    return true;
    }
}