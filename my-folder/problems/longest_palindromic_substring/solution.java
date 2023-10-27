class Solution {
    public String longestPalindrome(String s) {
        
        for (int k = s.length(); k>0; k--){
            for (int j = 0; j<= s.length()-k; j++){
                if (check(j, j+k-1, s)){
                    return s.substring(j, j+k);
                }
            }
        }

        return "";
    }

    public boolean check (int i, int j, String s){
        while (i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
                
            else return false;
        }
        return true;
    }
}