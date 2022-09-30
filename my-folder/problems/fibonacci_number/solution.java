class Solution {
    public int fib(int n) {
        int a = 0, b= 1;
        
        if (n<=1)
            return n;
        
        int ele = 0;
        for (int i = 2; i<=n; i++){
            ele = a + b;
            a = b;
            b = ele;
        }
        
        return ele;
    }
}