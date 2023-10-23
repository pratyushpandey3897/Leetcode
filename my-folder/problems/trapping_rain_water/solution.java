class Solution {
    public int trap(int[] height) {

        int water = 0;

       
        int [] dpleft = new int[height.length];
        int [] dpright = new int[height.length];

        dpleft[0] = height[0];
        dpright[height.length-1] = height[height.length-1];

        for (int i = 1, j= height.length-2; i<height.length; i++, j--){
            dpleft[i] = Math.max(dpleft[i-1], height[i]);
            dpright[j] = Math.max(dpright[j+1], height[j]);
        }

        for (int i = 1; i<height.length-1; i++){
            water+= Math.min(dpleft[i], dpright[i]) - height[i];
        }

//         for (int i = 1 ; i<height.length -1; i++){
//  int left_max = 0 , right_max = 0;
//             for (int j = i; j>=0; j--){
//                 left_max = Math.max(left_max, height[j]);
//             }

//             for (int j = i; j<height.length; j++){
//                 right_max = Math.max(right_max, height[j]);
//             }

//             int min_height = Math.min(left_max,right_max);
//             water += min_height- height[i];
//         }
        
        return water;
    }
}