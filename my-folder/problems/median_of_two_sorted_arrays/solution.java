class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length + nums2.length;

        int p1 = 0, p2 = 0;
        

        int ele1 = 0;
        int ele2 = 0;
        for (int i = 0; i <= n/2; i++){
            if (p1<nums1.length && p2<nums2.length){
                if (nums1[p1] > nums2[p2]){
                    ele1 = ele2;
                    ele2 = nums2[p2];
                    p2++;
                } else {
                    ele1 = ele2;
                    ele2 = nums1[p1];
                    p1++;
                }
            } else if (p1<nums1.length) {
                ele1 = ele2; 
                ele2 = nums1[p1];
                p1++;
            } else if (p2<nums2.length){
                ele1 = ele2;
                ele2 = nums2[p2];
                p2++;
            }
                
        }

        if (n%2 == 0)
            return ((double)ele1+ ele2)/2;
        
        return ele2;
    }
}