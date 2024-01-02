class Solution {
    public int strStr(String haystack, String needle) {

    

        for (int ptr1 = 0, ptr2 = needle.length(); ptr2<=haystack.length(); ptr2++, ptr1++){
            System.out.println(haystack.substring(ptr1, ptr2));
            if (haystack.substring(ptr1, ptr2).equals(needle)){
                return ptr1;
            }
        }

        return -1;
        
    }
}