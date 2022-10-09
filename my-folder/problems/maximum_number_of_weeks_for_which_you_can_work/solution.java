class Solution {
    public long numberOfWeeks(int[] milestones) {
        
        long sum = 0;
        long max = 0;
        for (int i=0; i< milestones.length; i++){
            sum += milestones[i];
            if (milestones[i]> max)
                max = milestones[i];
        }
        
        long gapFillers = sum -max;
        
       if(max-gapFillers>1)
    		return (sum - (max-gapFillers-1));
    	return sum;
        
    }
    
}