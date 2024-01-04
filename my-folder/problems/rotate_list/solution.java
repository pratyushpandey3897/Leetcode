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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null)
            return null;
        
        ListNode prevhead = head;
        ListNode node = head;
        int size=0;
        
        while (node!= null){
            size++;
            node = node.next;
        }

        k = k%size;
        if (k == 0)
            return head;
        node = head;
        for (int i = 0; i< size - k-1; i++){
            node = node.next;
        }

        ListNode ans = node.next;

        node.next = null; // break the list
        ListNode node2 = ans;

        while (node2.next!= null){
            node2 = node2.next;
        }
        node2.next = prevhead;
        return ans;

        
    }
}