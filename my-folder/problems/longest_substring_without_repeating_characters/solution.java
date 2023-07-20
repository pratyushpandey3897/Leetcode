class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     int pointer1 = 0;
    //     int pointer2 = 1;
        
    //     if (s.length() == 1)
    //         return 1;
        
        
    //     int max = 0;
        
    //     Queue<Character> queue = new LinkedList<>();
        
    //     for (int i = 0; i< s.length() ;i++){
            
            
            
    //         if(!queue.contains(s.charAt(i))){
    //             queue.offer(s.charAt(i));
                
    //             max = max > queue.size() ? max : queue.size();
    //         } else {
                
    //             while(queue.peek() != s.charAt(i)){
    //                 queue.poll();
    //             }
                
    //             queue.poll();
    //             queue.offer(s.charAt(i));
                
    //             max = max > queue.size() ? max : queue.size();
                
    //         }
            
    //     }
        
    //     return max;
    // }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();

        int l = 0;
        set.add(s.charAt(l));
        int r = 1;
        int max = 1 ;
        while (r < s.length() && l < s.length() ) {

            if (!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }


            max = max > set.size() ? max : set.size();

        }

        return max;    

    }
}