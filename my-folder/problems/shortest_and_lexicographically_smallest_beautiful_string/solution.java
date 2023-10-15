class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String answer;
        if (s.chars().filter(ch -> ch == '1').count() >= k)
            answer = s;
        else 
            return ""; 
        for(int p =k ; p<= s.length(); p++){
            for (int i = 0; i< s.length()-p+1; i++){
                String sub = s.substring(i, i+p);
                
                if ( sub.length()< answer.length() && sub.chars().filter(ch -> ch == '1').count() == k){
                    answer = sub;
                    
                } else if (sub.length()== answer.length() && sub.compareTo(answer) < 0 && sub.chars().filter(ch -> ch == '1').count() == k) {
                     answer = sub;
                }

            }
        }
        
        return answer;
        
    }
}