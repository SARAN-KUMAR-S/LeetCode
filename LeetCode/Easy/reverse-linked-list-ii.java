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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode temp = head;
    
        while(temp!=null){
            ListNode n = temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        ListNode temp2 = head;
        int i =1;
        ListNode ans = new ListNode();
        ListNode ans1 = ans;
        while(temp2!=null && prev!=null){
            if(i>=left && i<=right){
                ans1.next = new ListNode(prev.val);
                
            }
            else{
                ans1.next = new ListNode(temp2.val);
            }
            ans1 = ans1.next;
            temp2=temp2.next;
            prev=prev.next;
            i++;
        }
        return ans.next;
    }
}