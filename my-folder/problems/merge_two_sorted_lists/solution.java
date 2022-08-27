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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedListHead = new ListNode(-1);
        ListNode temp = mergedListHead;
        while (list1 != null && list2!=null){
            if (list1.val < list2.val){
                mergedListHead.next = list1;
                list1 = list1.next;
            } else {
                mergedListHead.next = list2;
                list2 = list2.next;
            }
            mergedListHead = mergedListHead.next;
        }
        
        if (list1 != null){
            mergedListHead.next = list1;
        }
        if (list2 != null){
            mergedListHead.next = list2;
        }
        
        return temp.next;
    }
}