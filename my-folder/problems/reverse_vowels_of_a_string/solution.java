class Solution {
    public String reverseVowels(String s) {
        
        int left = 0, right = s.length()-1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u', 'A','E','I','O','U'));

        StringBuilder sb = new StringBuilder(s);
        
        while (left<right && left < s.length() && right > 0){
            System.out.println(left + " - " + right);
            
            if (vowels.contains(sb.charAt(left)) && vowels.contains(sb.charAt(right)) ){
                char temp = s.charAt(right);
                sb.setCharAt(right, s.charAt(left));
                sb.setCharAt(left , temp);
                left++;
                right--;
            } else if (vowels.contains(s.charAt(left)) && !vowels.contains(s.charAt(right))){
                right--;
            } else if (!vowels.contains(s.charAt(left)) && vowels.contains(s.charAt(right))){
                left++;
            } else { 
            left++;
                right--;
            }
        }
        return sb.toString();
    }
}