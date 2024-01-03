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
    public ListNode deleteDuplicates(ListNode head) {

        Set<Integer> s = new HashSet<>();
        if (head == null)
        return head;
        ListNode currnode = head;
        s.add(currnode.val);
        ListNode prevnode = head;
        currnode = currnode.next;
        while (currnode != null){
            if (s.contains(currnode.val))
            {
                prevnode.next = currnode.next;
        
            } else {
                s.add(currnode.val);
                prevnode = currnode;
            }
            
            currnode = currnode.next;
        }

        return head;
        
    }
}