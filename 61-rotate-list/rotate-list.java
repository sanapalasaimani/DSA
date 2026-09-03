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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;}
        k%=size;
        temp=head;
        ListNode result=new ListNode(0);
        ListNode dummy=result;
        for(int i=0;i<size;i++){
          if(i<size-k) temp=temp.next;
          else{dummy.next=new ListNode(temp.val);
          dummy=dummy.next;
          temp=temp.next;}
          
        }
        for(int i=0;i<size-k;i++){
           dummy.next=new ListNode(head.val);
           head=head.next;
           dummy=dummy.next;
        }
        return result.next;
    }

}