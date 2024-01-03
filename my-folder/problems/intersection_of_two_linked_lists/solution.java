/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();

        ListNode currnode = headA;
        while (currnode != null){
            s.add(currnode);
            currnode = currnode.next;
        }
        currnode = headB;
        while (currnode!=null){
            if (s.contains(currnode))
                return currnode;
            currnode = currnode.next;
        }

        return null;
        
    }
}