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
    public ListNode deleteMiddle(ListNode head) {
        
        if (head.next == null || head == null)
            return null;
        
        ListNode node = new ListNode();
        ListNode nodeFast = new ListNode();
        node.next = head;
        nodeFast.next = head;
        
        while (node.next != null && nodeFast.next != null) {
            
            if (nodeFast.next.next == null)
                break;
            
            node = node.next;
            nodeFast = nodeFast.next.next;
            
        }
        
        node.next = node.next.next;
        
        return head;
    }
}