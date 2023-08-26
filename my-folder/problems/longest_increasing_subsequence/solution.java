class Solution {
    public int lengthOfLIS(int[] nums) {
        
        Integer [] lis = new Integer[nums.length];
        int [] prevIdx = new int[nums.length];  // to record the actual subsequence
        Arrays.fill(prevIdx,-1);
        Arrays.fill(lis,1);
        for (int i = 0; i< nums.length; i++){

            for (int j = i ; j >=0 ; j--){
                if (nums[i] > nums[j]){
                    if (lis[i] < lis[j] + 1){
                        lis[i] = lis[j] + 1;
                        prevIdx[i] = j;
                    }
                    
                }
            }
        }
        
        int maxidx = 0;
        for (int i = 0; i< nums.length; i++){
            if (lis[i] > lis[maxidx])
                maxidx = i;
        }

        

        int p = maxidx;
        while (p >=0){
            System.out.print(nums[p] + " ");
            p = prevIdx[p];
        }



        return Collections.max(Arrays.asList(lis));
    }
}