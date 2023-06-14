class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        if (citations.length == 1 && citations[0] !=0 )
            return 1;

        int h = 0;
        int low = 0;
        int high = citations.length - 1;

        while (low <= high){
            int mid = (high+low)/2;

            if ((citations.length - mid) == citations[mid]){
                return citations[mid];
            } else if ((citations.length - mid) > citations[mid]) {
                low = mid + 1;
            }
            else if ((citations.length - mid) < citations[mid]){
                high = mid - 1;
            }
        }

        return citations.length-low;
        
    }
}