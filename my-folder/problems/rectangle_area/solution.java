class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        

        // ax1, ay1.   ax2, ay2

        // for quad a 
        int a_w = Math.abs(ax1 - ax2);
        int a_b = Math.abs(ay1 - ay2);
        int area_a = a_b*a_w;

        // for quad b
        int b_w = Math.abs(bx1 - bx2);
        int b_b = Math.abs(by1 - by2);
        int area_b = b_w*b_b;

        int left = Math.max (ax1,bx1);
        int right = Math.min(ax2, bx2);
        int top = Math.min(ay2, by2);
        int bottom = Math.max(ay1, by1);
        int overlap_area = 0;
        if( left < right && top > bottom){
            //overlap
            overlap_area = (right-left)*(top-bottom);
        }

        return area_a + area_b - overlap_area;

    }
}