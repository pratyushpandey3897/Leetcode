class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for (int i = 0; i< flowerbed.length; i++){

            if (flowerbed[i] == 0 ){

                if (i > 0){
                    if (flowerbed[i-1] == 0){
                        if (i == flowerbed.length - 1 || flowerbed[i+1] == 0){
                            
                                System.out.println ("positions :" + i);
                                flowerbed[i] = 1;
                                n -=1;
                            
                        } 
                    }
                } else {
                    if (i == flowerbed.length - 1 || flowerbed[i+1] == 0){
                        
                            flowerbed[i] = 1;
                            n-=1;
                        
                    }
                }
            }

            if (n<=0)
                return true;
        }

        return false;
    }
}