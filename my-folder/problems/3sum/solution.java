class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletList = new ArrayList<>();
        //List<Integer> triplets = new ArrayList<>();
        
        Arrays.sort(nums);
        // [-4,-1,-1,0,1,2]
        
        
        for (int i =0; i< nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            
            int l = i+1, r = nums.length -1;
            while (l < r){
                
                int threesum = nums[i] + nums[l] + nums[r];
                
                if (threesum == 0){
                    tripletList.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l = l+1;
                    while (nums[l] == nums[l-1] && l<r)
                        l+=1;
                }
                else if (threesum > 0){
                    r = r-1;                    
                } else 
                    l = l+1;
                                    
            }
        }
        return (tripletList);
    }
}