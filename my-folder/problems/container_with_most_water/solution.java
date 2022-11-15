class Solution {
    public int maxArea(int[] height) {
        
        int i =0;
        int j = height.length-1;

        int maxCap = Integer.MIN_VALUE;
        while (i<j){

            int waterCap = (j-i)*Math.min(height[i], height[j]);
            maxCap = waterCap > maxCap ? waterCap : maxCap;
            if (height[j] > height[i]){
                i++;
            } else if (height[j] < height[i]){
                j--;
            } else {
                j--;
                i++;
            }
        }

        return maxCap;
    }
}