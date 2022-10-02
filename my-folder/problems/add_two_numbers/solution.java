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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode addedList = new ListNode();
        ListNode temp = addedList;
        int c =0;
        while(l1 != null || l2 != null || c!=0)
        {
            int sum = (l1==null? 0: l1.val) + (l2==null?0:l2.val) + c;
            int digit = sum % 10;  // 9+7 = 16 >> 6 or 5+3 = 8 >> 8
            c= sum/10;
            addedList.next = new ListNode(digit);
            
            l1 = l1==null? l1:l1.next;
            l2= l2==null? l2:l2.next;
            addedList=addedList.next;
            
        }
        
        
        
        return temp.next;
        
        
    }
    
//     public ListNode addition(ListNode l1, ListNode l2, int c, ListNode addedList){
        
//         if (l1 == null && l2 == null)
//             return addedList;
//         int sum = (l1==null? 0: l1.val) + (l2==null?0:l2.val) + c;
//         int digit = sum % 10;  // 9+7 = 16 >> 6 or 5+3 = 8 >> 8
//         c= sum/10;
//         addedList.next = new ListNode(digit);
        
//         return addition(l1.next, l2.next, c, addedList.next);
        
//     }
}