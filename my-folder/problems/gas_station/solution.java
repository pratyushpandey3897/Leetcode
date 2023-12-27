class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int ans = 0;

        int sumofgas = Arrays.stream(gas).sum();
        int sumofcost = Arrays.stream(cost).sum();

        if (sumofcost>sumofgas)
            return -1;
        
        int gain = 0;
        for (int i = 0; i< gas.length; i++){
            
            gain += gas[i]-cost[i];

            if (gain<0){
                ans = i+1;
                gain =0;
            }
        }

        return ans;
    
    }   
}