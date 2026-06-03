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
    public void reorderList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        int n =0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            st.add(temp.val);
            temp=temp.next;
        }

        ListNode ans = new ListNode();
        ListNode ans1 =ans;
        int i = 0 ;
        while(i<n){
            if(i%2==0){
                ans1.next = new ListNode(head.val);
                head=head.next;
            }
            else{
                ans1.next = new ListNode(st.pop());
            }
            i++;
            ans1=ans1.next;
        }
        
    }
}