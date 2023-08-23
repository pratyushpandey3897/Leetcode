class Solution {
    public String reorganizeString(String s) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i =0; i< s.length(); i++){
            freq.put(s.charAt(i) , freq.getOrDefault(s.charAt(i) , 0) + 1);
        }

        PriorityQueue<int []> pq = new PriorityQueue<> ((a,b) -> Integer.compare(b[1], a[1]));

        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            char c = entry.getKey();
            int val = entry.getValue();
            pq.offer(new int[] {c, val});
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            var first = pq.poll();

            if (sb.length() == 0 || sb.charAt(sb.length()-1) != first[0]){
                sb.append((char)first[0]);
                first[1]--;
                if (first[1] > 0)
                    pq.offer(first);

            } else {
                if (pq.isEmpty())
                    return "";

                var second = pq.poll();
                sb.append((char)second[0]);
                second[1]--;
                if (second[1] > 0)
                    pq.offer(second);
                
                pq.offer(first);                                               
            }
        }

        return sb.toString();

        
    }
}