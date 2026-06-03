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
        ListNode firstn = reverse(l1);
        ListNode secn = reverse(l2);
        return secn;
    }
    public ListNode reverse(ListNode head){
        ListNode prev1 = null;
        while(head!=null){
            ListNode n = head.next;
            head.next = prev1;
            prev1 = head;
            head = n;
        }
        return prev1;
    }

}