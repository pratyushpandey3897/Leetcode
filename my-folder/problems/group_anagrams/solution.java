class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){

            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String newstr = new String(arr);
            System.out.println(newstr);
            
            if (map.containsKey(newstr)){
                map.get(newstr).add(s);
            } else {
                map.put(newstr, new ArrayList<>());
                map.get(newstr).add(s);
            }
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}