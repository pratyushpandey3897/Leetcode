class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int i = 0;
        int count = 0;
        while (i < word.length() -k) {
            String remaining = word.substring(i+k);
            count++;

            if (word.startsWith(remaining)){
                return count;
            } else {
                i = i+k;
            }
        }

        return count+1;
    }
}