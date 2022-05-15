class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // merging them
        int n1 =0, n2=0, n3=0;
        int[] arrMerged = new int[nums1.length+nums2.length];
        
        while (n1 < nums1.length && n2 < nums2.length){
            
            if (nums1[n1] < nums2[n2])
                arrMerged[n3++] = nums1[n1++];
            else
                arrMerged[n3++] = nums2[n2++];
        }
        
        while (n1 < nums1.length)
            arrMerged[n3++] = nums1[n1++];        
        while (n2 < nums2.length)
            arrMerged[n3++] = nums2[n2++]; 
        double median;
        
        if (arrMerged.length % 2 != 0)
            median = arrMerged[arrMerged.length/2];
        else {
            int temp =arrMerged.length/2;
            median = (arrMerged[temp-1] + arrMerged[temp])/2.0;
            }
        
        return median;
    }
}