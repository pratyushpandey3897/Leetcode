class Solution {
    public List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        
        int [] visited = new int[nums.length];

        //int [] perm = new int[nums.length];
        helper(new ArrayList<Integer>(), visited, nums, 0);

        return ans;
        

    }


    public void helper(List<Integer> perm, int [] visited, int[] nums, int idx ){

        
        if (idx == nums.length){
            //List<Integer> p = Arrays.stream(perm).boxed().collect(Collectors.toList());
            ans.add(new ArrayList<>(perm));
            return;
        }

        for (int i=0; i< nums.length; i++){ // all possible elements

            if (visited[i] == 1)
                continue;
            
            else {
                visited[i] = 1;
                perm.add(nums[i]);
                helper(perm, visited, nums, idx+1);
                visited[i] = 0;
                perm.remove(perm.size()-1);
            }
        }
            

    }
}