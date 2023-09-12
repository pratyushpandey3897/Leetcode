class Solution {
    public int minDeletions(String s) {
        
        Integer [] freq =new Integer[26];
        Arrays.fill(freq,0);
        Set<Integer> f = new HashSet<>();
        for (int i =0 ;i < s.length(); i++){
            freq[s.charAt(i) - 'a'] += 1;
        }
        
        Arrays.sort(freq, Collections.reverseOrder());
        int cnt = 0;
        for(int i =1 ; i<26 ; i++){

            if (freq[i] != 0 && freq[i].equals(freq[i-1]))
            {   
                System.out.print (freq[i]);
                cnt++;
                freq[i] -= 1;
            } 
            else if (freq[i] > freq[i-1]){

                if (freq[i-1] == 0){
                    cnt += freq[i];
                    freq[i] = freq[i-1];
                } else {
                cnt += freq[i] - freq[i-1] + 1;
                freq[i] = freq[i-1] -1;
                }
            }
        }

        return cnt;
    }
}