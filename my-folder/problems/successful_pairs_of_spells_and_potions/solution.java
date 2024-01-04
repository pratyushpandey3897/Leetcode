class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];

        Arrays.sort(potions);
        for (int i = 0; i< spells.length; i++){
            int low = 0, high = potions.length-1;
            double minpotion = Math.ceil(1.0*success/spells[i]);
            if (minpotion > potions[potions.length-1]){
                pairs[i] = 0;
                continue;
            }
            while (low<high){
                int mid = low + (high-low)/2;
                if (potions[mid] <minpotion){
                    low = mid+1;
                } else if (potions[mid] >= minpotion) {
                    high = mid;
                }
            }
            pairs[i] = potions.length - low;
        }

        return pairs;
    }
}