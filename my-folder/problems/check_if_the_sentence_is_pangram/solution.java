class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Boolean flag = false;
        HashSet<Character> charSet = new HashSet<>();
        
        for (int i =0; i<sentence.length(); i++){
            if (!charSet.contains(sentence.charAt(i))){
                charSet.add(sentence.charAt(i));
            }
            if (charSet.size() == 26)
                return true;
        }
        
        return false;
    }
}