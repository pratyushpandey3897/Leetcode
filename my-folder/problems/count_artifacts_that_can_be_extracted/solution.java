class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        int [][] digged = new int[n][n];
        int count =0;
        // Arrays.sort(dig, (a,b) -> {
        //     if (a[0] == b[0])
        //         return a[1]-b[1];
        //     return a[0]-b[0];
        // });
        Map<String, Boolean> digmap = new HashMap<>();
        for (int i =0; i< dig.length; i++){
            digmap.put(dig[i][0]+"-"+dig[i][1], true);
        }
        
        for (int a[]: artifacts){
            
            int starti = a[0], startj = a[1], endi = a[2], endj = a[3];
            boolean flag = true;
            
            //check digmap
            for (int i = starti ; i<= endi; i++){
                for (int j = startj; j<=endj; j++){
                    if (!digmap.containsKey(i+"-"+j)){
                        flag = false;
                        break;
                    }
                } 
                if (!flag)
                    break;
            }
            
            if (flag)
                count++;
              
        }
        
        return count;
        
    }
}