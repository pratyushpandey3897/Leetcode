class Solution {
    public int largestAltitude(int[] gain) {
        
        
        int ele=0;
        int max = 0;
        for (int i =1 ; i< gain.length + 1; i ++){
            ele = ele + gain[i-1];
            max = Math.max(max, ele);
        }

        return max;
    }
}