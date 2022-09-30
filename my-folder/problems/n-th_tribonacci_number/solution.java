class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        if (n<=1)
            return n;
        int ele =a+b;
        for (int i=3; i<=n; i++){
            ele = a+b+c;
            a= b;
            b=c;
            c=ele;
        }
            
    return ele;
    }
}