class Solution {
    public int kthFactor(int n, int k) {
        
        List<Integer> fl = new ArrayList<>();
        
        fl.add(1);
        fl.add(n);


        for (int i = 2; i <= n/2 ; i++){
            if (n %i == 0){
                fl.add(i);
            }
        }

        if (k > fl.size())
            return -1;
        
        Collections.sort(fl);
        return fl.get(k-1);


    }
}