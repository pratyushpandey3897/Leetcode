class Solution {
    public boolean isPalindrome(int x) {
        
        if (x <0)
        return false;

        int comp1 = x;
        int comp2 = 0;
        while (comp1 >0){
            int a = comp1 % 10;
            comp2 = (comp2*10) + a;
            comp1 = comp1/10;
        }

        if (comp2 == x)
            return true;
        return false;
    }
}