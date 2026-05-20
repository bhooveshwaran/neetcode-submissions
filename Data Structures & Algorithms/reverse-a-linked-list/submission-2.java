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
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;

        ListNode current = head;

        while (current != null) {

            ListNode nextNode = current.next; //Save list minus firstelement

            current.next = rev; //Cut link after first.

            rev = current; // Update head of new list with first element.

            current = nextNode; // Update old list with saved list.

        }

        return rev;

    }
}
