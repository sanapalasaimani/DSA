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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head;
        int value=temp.val;
        temp=temp.next;
        int start=0,end=0;
        int min=Integer.MAX_VALUE,max=-1;
        int i=2;
        int prev=-1;
        while(temp.next!=null){
            int curr=temp.val;
            int next=temp.next.val;
            if((curr>value && curr>next) || (curr<value && curr<next)){
                if(start==0){
                    start=i;
                    prev=i;}
                else{end=i; min=Math.min(min,end-prev);}
                prev=i;
            }
            value=curr;
            i++;
            temp=temp.next;
        }
        if(min==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{min,end-start};
    }
}