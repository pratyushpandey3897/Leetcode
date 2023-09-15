class Solution {
    public int maxVowels(String s, int k) {
        
        int left = 0; 
        int maxvowel = 0;
        int count = 0;
        for (int i =0 ; i< s.length(); i++){

            if (i > k-1){
                if (vowelCheck(s.charAt(i))) {
                    count++;
                }

                if (vowelCheck(s.charAt(left))){
                        count--;
                }

                    
                left++;
                
            } else {
                if (vowelCheck(s.charAt(i))){
                        count++;
                    }
            }

            maxvowel = Math.max(maxvowel, count);
        }

        return maxvowel;
    }


    public boolean vowelCheck(Character c){
        if (c == 'a' || c == 'e' || c =='i' || c== 'o' || c=='u')
            return true;
        
        return false;
    }
}