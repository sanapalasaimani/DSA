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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)) return null;
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        temp=head;
        if(s==n) return head.next;
        int i=0;
        while(i<s-n-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
          
    }
}