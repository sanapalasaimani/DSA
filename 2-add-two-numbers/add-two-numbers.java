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
        ListNode head=new ListNode(0);
        ListNode dummy=head;
        int c=0;
        while(l1!=null || l2!=null){
            int a=(l1==null)?0:l1.val;
            int b=(l2==null)?0:l2.val;
            c+=a+b;
            dummy.next=new ListNode(c%10);
            if(c>9) c=1;
            else c=0;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            dummy=dummy.next;
        }
        if(c==1)dummy.next=new ListNode(1);
        return head.next;
    }
}