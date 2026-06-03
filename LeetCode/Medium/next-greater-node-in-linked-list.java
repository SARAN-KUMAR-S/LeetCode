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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        ListNode temp = head;
        int n= 0;
        while(temp!=null){
            while(!st.isEmpty() && temp.val>st.peek()){
                hm.put(st.peek(),temp.val);
                st.pop();
            }
            st.push(temp.val);
            temp=temp.next;
            n++;

        }
        int[] arr = new int[n];
        int i =0;
        while(head!=null){
            if(hm.containsKey(head.val)){
                arr[i] = hm.get(head.val);
            }
            else{
                arr[i]=0;
            }
            head=head.next;
            i++;
        }
        return arr;
    }
}