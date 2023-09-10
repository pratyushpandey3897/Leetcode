class Solution {
    public int partitionString(String s) {
        
        int part_count = 0;

        Set<Character> set = new HashSet<>();

        for (int i =0 ; i <s.length(); i++){
            if (set.contains(s.charAt(i))){
                part_count ++;
                set.clear();
            }
            set.add(s.charAt(i));
        }

        return part_count+1;
    }
}