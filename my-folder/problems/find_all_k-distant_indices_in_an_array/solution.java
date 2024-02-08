class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> ans = new HashSet<>();
        for (int i =0; i<nums.length;i++ ){
            for (int j = i ; j>=0; j--){
                if (Math.abs(i-j) <=k && nums[j] == key ){
                    ans.add(i);
                }
            }
            
            for (int j = i+1 ; j<nums.length; j++){
                if (Math.abs(i-j) <=k && nums[j] == key){
                    ans.add(i);
                }
            }
        }
        
        List<Integer> res = new ArrayList<>(ans);
        Collections.sort(res);
        return res;
    }
}