class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        // greedy 
        // int left  = 0;
        // int right = 0;

        // int totalTime = 0;
        


        // while (left < neededTime.length && right < neededTime.length){
        //     int currTotal = 0;
        // int currMax = 0;
        //     while (right < neededTime.length && colors.charAt(left) == colors.charAt(right)) {
        //         currTotal += neededTime[right];
        //         currMax = Math.max(neededTime[right] , currMax);
        //         right++;
        //     }

        //     totalTime += currTotal - currMax;
        //     left = right;
        // }
        
        // return totalTime;


        int totalTime = 0 ;
        int currMaxTime = 0;

        for (int i = 0; i< neededTime.length; i++){

            if (i > 0 && colors.charAt(i) != colors.charAt(i-1))
                currMaxTime = 0;

            totalTime += Math.min(currMaxTime, neededTime[i]);
            currMaxTime = Math.max(currMaxTime, neededTime[i]);
        }


        return totalTime;
    }
}