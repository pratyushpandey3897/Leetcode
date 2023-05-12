class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> m = new HashMap<>();
        for (int num: nums){
            if (m.containsKey(num)){
                m.put(num, m.get(num)+1);
            } else{
                m.put(num, 1);
            }

        }

        int maxkey = nums[0];
        for (Map.Entry<Integer, Integer> entry : m.entrySet()){
            int key = entry.getKey();
            if (m.get(key) > m.get(maxkey))
                maxkey = key;
        }

        return maxkey;
    }
}