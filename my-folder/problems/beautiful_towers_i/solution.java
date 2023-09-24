class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
    
        int n = maxHeights.size();
        
        int[] ans = new int[n];
         long maxans = 0;
        
        for (int p =0 ; p <n; p++){
            
            ans[p] =maxHeights.get(p);
            
            for (int i = p-1 ; i>= 0; i--){
            if (maxHeights.get(i) <= ans[i+1])
                ans[i] = maxHeights.get(i);
            else
                ans[i] = ans[i+1];
            }
            
            
            for (int i =p+1 ; i<n ; i++){
            if (maxHeights.get(i) <= ans[i-1])
                ans[i] = maxHeights.get(i);
            else
                ans[i] = ans[i-1];
            }
            
           long anssum = 0;
        for (int a : ans){
            anssum += a;
        }
            
            maxans = Math.max(maxans, anssum);
            
        }
        
        return maxans;
        
    }
}