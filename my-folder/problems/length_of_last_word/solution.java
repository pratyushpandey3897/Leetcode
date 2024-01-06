class Solution {
    public int lengthOfLastWord(String s) {
        int p1 = s.length()-1, p2 =0;
        int len = 0;

        while (p1 >= 0 && s.charAt(p1) == ' '){
            p1--;
        }

        p2 = p1;
        while (p2 >=0 && s.charAt(p2)!= ' '){
            p2--;
        }

        return p1-p2;
        
    }
}