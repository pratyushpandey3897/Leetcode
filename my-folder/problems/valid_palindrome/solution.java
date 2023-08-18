class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        s = s.toLowerCase();
        int leftptr = 0;
        int rightptr = s.length()-1;

        

        while (leftptr<= rightptr){
            if ( !( (s.charAt(leftptr) >= 'a' && s.charAt(leftptr) <= 'z') || (s.charAt(leftptr) >= '0' && s.charAt(leftptr) <= '9') ) ) {
                System.out.println(leftptr);
                leftptr++;
            } 
            else if ( !( (s.charAt(rightptr) >= 'a' && s.charAt(rightptr) <= 'z') || (s.charAt(rightptr) >= '0' && s.charAt(rightptr) <= '9') ) ) {
                System.out.println(rightptr);
                rightptr--;
            } 

            else {
if ( s.charAt(rightptr) != s.charAt(leftptr )) {

                System.out.println(s.charAt(leftptr ) + " " + s.charAt(rightptr));
                return false;
            }

            leftptr++;
            rightptr--; 
            }

            
            

        }

        return true;
    }
}