class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer1 = 0;
        int pointer2 = 1;
        
        if (s.length() == 1)
            return 1;
        
        
        int max = 0;
        
        Queue<Character> queue = new LinkedList<>();
        
        for (int i = 0; i< s.length() ;i++){
            
            
            
            if(!queue.contains(s.charAt(i))){
                queue.offer(s.charAt(i));
                
                max = max > queue.size() ? max : queue.size();
            } else {
                
                while(queue.peek() != s.charAt(i)){
                    queue.poll();
                }
                
                queue.poll();
                queue.offer(s.charAt(i));
                
                max = max > queue.size() ? max : queue.size();
                
            }
            
        }
        
        return max;
    }
}