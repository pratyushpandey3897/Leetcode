class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() -1;

        int left = 0, right = str.length() -1;

        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                    return false;
            }
            left++;
            right--;
        }
        // for (int i = 0; i < str.length() -1 ; i++) {
        //     if (str.charAt(i) != str.charAt(j)){
        //             return false;
        //     }
        //     j--;
        // }

        return true;
    }
}