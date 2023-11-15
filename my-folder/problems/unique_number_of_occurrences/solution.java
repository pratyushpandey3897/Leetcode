class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int a :arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> a :map.entrySet() ){
            if (set.contains(a.getValue()))
                return false;
            else
                set.add(a.getValue());
        }

        return true;
    }
}