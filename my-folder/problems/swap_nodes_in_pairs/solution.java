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
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null)
            return head;
        ListNode dumm = new ListNode(0,head);
        ListNode prev = dumm;
        
        ListNode a = head, b =head.next;
        while (a!=null && a.next !=null){
            
            b = a.next;
            
            prev.next = b;
            a.next = b.next;
            b.next = a;
            
            prev = a;
            a = prev.next;
            
        }
        
        return dumm.next;
    }
}