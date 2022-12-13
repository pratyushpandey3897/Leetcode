class Solution {
    public int reverse(int x) {
        
        if (x ==0)
            return 0;

        long num = 0;
        while(x!=0){

            int digit = x % 10;
            x = x/10;
            num = num*10 + digit;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
            return 0;
        
        return (int)num;
    }
}