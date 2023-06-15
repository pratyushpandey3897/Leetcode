class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;

        boolean negative = s.startsWith("-") ? true: false;
        int i =0;
        if (negative || s.startsWith("+") )
            i++;
        
        double num = 0;

        for (; i<s.length(); i++){
            if ( ('0' <= s.charAt(i) && s.charAt(i) <= '9')  ) {
                num = num *10 + (s.charAt(i) - '0');
                
            } else 
                break;
        }
        

        num = negative ? -num : num;

        num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
        num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;
        
        return (int) num;

        
    }
}