// Last updated: 6/2/2026, 11:27:51 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    ListNode dum = null;
13    ListNode frev1 = null;
14    ListNode frev =frev1;
15    ListNode srev =null;
16    public ListNode rotateRight(ListNode head, int k) {
17        if(head==null)return null;
18        int n=0;
19        ListNode temp = head;
20        while(temp!=null){
21            n++;
22            temp=temp.next;
23        }
24        
25        k = k%n;
26        if(n==1 || k==0)return head;
27      ListNode reversed =  rotate(dum , head);
28      ListNode srev = frev1(reversed,k,n);
29      ListNode frev3=frev;
30      while(frev3.next!=null){
31        frev3=frev3.next;
32      }
33      frev3.next=srev;
34      return frev;
35
36
37    }
38    public ListNode rotate(ListNode dum , ListNode head){
39        ListNode temp1 = head;
40        while(temp1!=null){
41            ListNode nex = temp1.next;
42            temp1.next=dum;
43            dum=temp1;
44            temp1=nex;
45        }
46    return dum;
47
48    }
49
50    public ListNode frev1(ListNode reversed,int k ,int n){
51        for(int i = 0 ; i <n ; i++){
52            if(i<k){
53            ListNode nex = reversed.next;
54            reversed.next=frev;
55            frev=reversed;
56            reversed=nex;
57            }
58            else{
59            ListNode nex = reversed.next;
60            reversed.next=srev;
61            srev=reversed;
62            reversed=nex;
63            }
64        }
65        return srev;
66    }
67}