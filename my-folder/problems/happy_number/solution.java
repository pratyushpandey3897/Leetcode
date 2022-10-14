class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        while (n != 0){
        
            int sum = 0;
            while (n!=0){
                int a = n%10;
                sum += a*a;
                n = n/10;
            }
            if (sum == 1)
                return true;
            else if (set.contains(sum))
                return false;
            else{
                set.add(sum);
                n = sum;
            }
        }
        
        return false;
    }
    
}