class Solution {
    public int minStartValue(int[] nums) {


    int left = 1, right = 10001;

    while (left < right){
        int mid = left - (left-right)/2;
        int currv = mid;
        boolean flag = true;

        for( int j = 0; j< nums.length; j++){
                currv = currv + nums[j];
                if (currv < 1){
                    flag = false;
                    break;
                }
        }

        if (flag)
            right = mid;
        else
            left = mid +1; 

    }

    return right;
    
        // for (int sv = 1; sv<=10000; sv++){
        //     int currv = sv;
            
        //     for( int j = 0; j< nums.length; j++){
        //         currv = currv + nums[j];
        //         if (currv < 1){
        //             flag = false;
        //             break;
        //         }
        //     }  

        //     if (flag)
        //         return sv; 
        // }

        // return 0;
        
    }
}