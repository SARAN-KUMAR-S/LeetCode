/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    HashMap<ListNode,Integer> hm = new HashMap<>();
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        int i = 0;
        while(temp!=null){
            if(hm.containsKey(temp)){
                return temp;
            }
            hm.put(temp,i);
            i++;
            temp=temp.next;
    }
    return null;
    }
}
