class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        
        Integer [] freq = new Integer[101];
        Arrays.fill(freq,0);
        for (int n : nums){
            freq[n]++;
        }
        
        Arrays.sort(freq, Collections.reverseOrder());
        
        int max = freq[0];
        for (int i =1 ;i <freq.length; i++){
            if (freq[i] == freq[0]){
                max+= freq[i];
            }
        }
        
        return max;
    }
}