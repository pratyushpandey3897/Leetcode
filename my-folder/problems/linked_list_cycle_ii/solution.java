/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null)
            return null;
        HashSet<ListNode> set = new HashSet<>();
        set.add(head);
        while (head!=null){
            if (!set.contains(head.next)){
                set.add(head.next);
                head = head.next;
            } else
                return head.next;
        }
        
        return null;
    }
}