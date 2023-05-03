class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int e: nums1)
        s1.add(e);

        Set<Integer> s2 = new HashSet<>();
        for(int e: nums2){
            if(s1.contains(e))
                s2.add(e);
        }

        int[] arr = new int[s2.size()];
        int j = 0;
        for (Integer val : s2) {
            arr[j] = val.intValue();
            j++;
        }

        return arr;
    }
}