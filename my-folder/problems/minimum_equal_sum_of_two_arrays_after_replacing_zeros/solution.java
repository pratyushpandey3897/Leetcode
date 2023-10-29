class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        
        long num1sum = 0;
        int num1zcnt = 0;
        int num2zcnt = 0;
        long num2sum = 0;
        
        int maxelevalue = Integer.MAX_VALUE;
        
        for (int n : nums1 ){
            num1sum += n;
            if (n==0)
                num1zcnt++;
                
        }
        for (int n : nums2 ){
            num2sum += n;
            if (n==0)
                num2zcnt++;
                
        }
        
        System.out.println("num1sum :"+num1sum);
        System.out.println("num2sum :"+num2sum);
        
        
        if (num1sum == num2sum && (num1zcnt ==0 && num2zcnt ==0))
            return num1sum;
        
        if (num1sum == num2sum && (num1zcnt ==0 || num2zcnt ==0))
            return -1;
        
        long newnum1sum = num1zcnt+num1sum;
        long newnum2sum = num2zcnt+num2sum;
        
        if (newnum1sum > newnum2sum){
            // long newnum1sum = num1zcnt+num1sum;
            long diff = newnum1sum - num2sum;
            System.out.println("diff :"+diff);
            if (num2zcnt == 0 || diff/num2zcnt == 0 )
                return -1;
            
            else if (diff/num2zcnt >maxelevalue || diff%num2zcnt >maxelevalue) {
                return -1;
            }
            else {
                return newnum1sum;
            }
            
            
        } else if (newnum1sum < newnum2sum){
            // long newnum2sum = num2zcnt+num2sum;
            long diff = newnum2sum - num1sum;
            System.out.println("diff :"+diff);
            if (num1zcnt == 0 || diff/num1zcnt == 0 )
                return -1;
            else if (diff/num1zcnt >maxelevalue || diff%num1zcnt >maxelevalue ) {
                return -1;
            }
            else {
                return newnum2sum;
            }
        } else {
            // int zerotobeconsidered = Math.max(num1zcnt, num2zcnt);
            return (newnum1sum);
        }
        
        // return -1;
        
        
        
    }
}