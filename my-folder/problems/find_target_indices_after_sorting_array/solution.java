class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tcnt = 0; 
        int lessthancnt = 0; 
        for (int num : nums){
            if (num == target)
                tcnt++;
            else if (num < target)
                lessthancnt++;
        }

        List<Integer> ans = new ArrayList<>();
        if (tcnt == 0)
            return ans;
        
        for (int i = lessthancnt; i< (lessthancnt+tcnt); i++){
            ans.add(i);
        }
        return ans;
    }   
}