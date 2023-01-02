class Solution {
    public boolean detectCapitalUse(String s) {
        
        int cnt = 0;
        int idx = -1;

        for (int i =0 ; i<s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                cnt++;
                idx = i;
            }
        }

        if (cnt == 0 || cnt == s.length() || (cnt == 1 && idx == 0))
            return true;
        else
            return false;
    }
}