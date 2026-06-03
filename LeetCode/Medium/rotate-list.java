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
    ListNode prev = null;
    ListNode fh = null;
    ListNode fh1 =fh;
    ListNode sh1 = null;
    ListNode sh = sh1;
    public ListNode rotateRight(ListNode head, int k) {
        int n =0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        rotate(head);
        reverse(prev,k , n);
        while(fh1.next!=null){
            fh1= fh1.next;
        }
        fh1.next = sh1;
        return fh;

    }

    public void rotate(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            ListNode nex = temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }

    }
    public void reverse(ListNode head1, int k , int n ){
        ListNode temp1 = head1;
        for(int i = 0 ; i<n ; i++){
            
            if(i<k){
                ListNode nex = temp1.next;
                temp1.next=fh1;
                fh1=temp1;
                temp1=nex;

            }
            else{
                ListNode nex1 = temp1.next;
                temp1.next = sh;
                sh=temp1;
                temp1=nex1;
            }
        }
    }
}