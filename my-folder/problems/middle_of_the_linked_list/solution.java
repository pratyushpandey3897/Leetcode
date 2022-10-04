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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        
        while (fast.next!=null && slow.next!=null){
            if (fast.next.next == null){
                fast = fast.next;
            } else
                fast = fast.next.next;
            slow=slow.next;
                
        }
        
        return slow;
    }
}