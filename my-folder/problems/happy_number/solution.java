class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!= 1 && !s.contains(n)){
            s.add(n);
            n = squares(n);
        }
        return n==1;
        
        
    }

    public int squares(int n){
        int sum = 0;
        while (n>0){
            int d = n%10;
            sum += d*d;
            n=n/10;
        }
        return sum;
    }
}