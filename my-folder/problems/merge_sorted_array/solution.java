import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] arr3 = Arrays.stream(nums1).toArray();
        int i = 0, j=0, k=0;
        
        while (i<m && j<n){
            if (arr3[i] <= nums2[j]){
                nums1[k++] = arr3[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
            
        }
        
        while (k < m+n && i < m){
            nums1[k++] = arr3[i++];
        }
        
        while (j < n){
            nums1[k++] = nums2[j++];
        }
            
    }
}