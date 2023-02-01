class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int [] targetarr = new int [nums.length];

        List<Integer> l = new ArrayList<>();

        for (int i=0 ;i <nums.length; i++){
            
            l.add(index[i],nums[i]);
        }

        for (int i=0 ;i <nums.length; i++){
            
            targetarr[i]= l.get(i);
        }

        return targetarr;
    }
}