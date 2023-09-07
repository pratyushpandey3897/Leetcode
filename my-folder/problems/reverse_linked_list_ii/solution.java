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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode prev = ans;
        
        for (int i = 1; i <= left -1 ; i ++){
            prev = prev.next;
        }

        ListNode cur = prev.next;

        for (int i = 0; i < right - left ; ++i){
            
            ListNode nextN = cur.next;
            cur.next = nextN.next;
            nextN.next= prev.next;
            prev.next = nextN;

        }

        return ans.next;
        
    }
}