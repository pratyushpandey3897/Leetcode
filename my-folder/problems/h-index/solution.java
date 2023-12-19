class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        // if (citations.length == 1 && citations[0] !=0 )
        //     return 1;

        // int h = 0;
        // int low = 0;
        // int high = citations.length - 1;

        // while (low <= high){
        //     int mid = (high+low)/2;

        //     if ((citations.length - mid) == citations[mid]){
        //         return citations[mid];
        //     } else if ((citations.length - mid) > citations[mid]) {
        //         low = mid + 1;
        //     }
        //     else if ((citations.length - mid) < citations[mid]){
        //         high = mid - 1;
        //     }
        // }

        // return citations.length-low;

// 0,1,3,5,6
        int hidx = 0;
        for (int i = 0; i <citations.length; i++){
            if (citations[i] <= (citations.length - i) )
                    hidx = citations[i];
                else {
                   hidx = Math.max(hidx, citations.length - i);
                }
        }

        return hidx;
        
    }
}