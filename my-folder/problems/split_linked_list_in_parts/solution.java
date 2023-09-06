/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode cur = head;
        while (cur != null){
            size++;
            cur = cur.next;
        }

        int partsize_s = size/k;
        int rem_q = size%k;

        ListNode[] ans = new ListNode[k];
        cur = head;
        
        for ( int i = 0; i < k; i++){ // part loop
            ListNode ln = cur;
            for (int j =0 ; j< partsize_s + (i<rem_q ? 1: 0) -1 ; j++ ){ // elements of a part loop
                if (cur != null)
                    cur = cur.next;
            }

            if (cur != null){
                ListNode temp = cur;
                cur = cur.next;
                temp.next = null;
            }

            ans[i] = ln;
        }

        

        return ans;
    }
}