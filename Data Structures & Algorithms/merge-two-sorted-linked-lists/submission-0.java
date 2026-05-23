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

public class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode resHead = new ListNode(0);
        ListNode resTail = resHead;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                resTail.next = head1;
                head1 = head1.next;
            } else {
                resTail.next = head2;
                head2 = head2.next;
            }
            resTail = resTail.next;
        }

        if (head1 != null) {
            resTail.next = head1;
        } else {
            resTail.next = head2;
        }

        return resHead.next;
    }
}