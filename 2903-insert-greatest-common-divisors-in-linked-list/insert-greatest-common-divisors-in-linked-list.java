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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode next = head.next;

        while (next != null) {

            ListNode mid = new ListNode(hcf(curr.val, next.val));
            curr.next = mid;
            mid.next = next;

            curr = next;
            next = next.next;
        }

        return head;
    }

    private int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}