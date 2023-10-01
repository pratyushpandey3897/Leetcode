class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");

        
        StringBuilder sb = new StringBuilder();
        for (String word: arr){
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        sb.replace(sb.length()-1, sb.length(), "");
        return sb.toString();
    }
}