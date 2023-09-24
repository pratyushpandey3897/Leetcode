class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int one_count = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '1')
                one_count++;
        }
        
        if (s.length() == 1 && one_count ==1)
            return "1";
        
         
            for (int i=0; i< one_count-1 ;i++){
                sb.append("1");
            }
            for (int i =0;i < s.length()-one_count ;i++){
                sb.append("0");
            }
            
            if (sb.length() == s.length()-1)
            // for (int i =0; i< s.length() -one_count; i++)
                sb.append("1");
        
        
        return sb.toString();
        
            
        
    }
}