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
    public boolean hasCycle(ListNode head) {
        Set<Object> map = new HashSet<Object>();
        Boolean cycleFlag = false;
        if (head == null)
            return false;
        while(!map.contains(head)){
            map.add(head);
            
            head = head.next;
            if (head == null){
                return false;
            }
        }
        return true;
    }
}