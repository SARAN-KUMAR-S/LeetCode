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
    public ListNode swapPairs(ListNode head) {
        ListNode temp =head;
       
        ListNode odd1 = new ListNode(0);
        ListNode odd = odd1;
        ListNode even1 = new ListNode(0);
        ListNode even =even1;
        int i = 0;
        while(temp!=null){
            ListNode n = new ListNode(temp.val);
            if(i%2==0){
                even.next = n;
                even = even.next;
            }
            else{
                odd.next = n;
                odd = odd.next;
            }
            temp=temp.next;
            i++;
        }
        ListNode ans = new ListNode(0);
        ListNode ans1 = ans;
        int j=1;
        while(even.next!=null && odd.next!=null){
            if(j%2==0){
                ListNode n2 = new ListNode(even1.next.val);
                even1=even1.next;
                ans1.next = n2;

            }
            else{
                ListNode n3 = new ListNode(odd1.next.val);
                odd1=odd1.next;
                ans1.next = n3;
            }
            ans1=ans1.next;
            j++;
        }
        while(even1.next!=null){
            ans1.next = new ListNode(even1.next.val);
            even1=even1.next;
            ans1=ans1.next;
        }
        while(odd1.next!=null){
            ans1.next = new ListNode(odd1.next.val);
            odd1=odd1.next;
            ans1=ans1.next;
        }
        return ans.next;

    }
}