class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {

        int [] freq = new int[21];
        for (int ele: nums){
            freq[10+ele] += 1;
        }

        int [] vst = new int[nums.length];

        helper(nums, freq, new ArrayList<>(), 0);
        return ans;
        
    }

    public void helper (int[] nums, int[] freq, List<Integer> temp, int idx ){

        if (idx == nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        for (int i =-10; i<=10; i++){ // all possible next elements

            if (freq[10+i] == 0)
                continue;
            
            else {
            freq[10+i] -= 1;
            temp.add(i);
            helper(nums, freq, temp, idx+1);
            temp.remove(temp.size()-1);
            freq[10+i] += 1;
            }

        }
        

    }
}