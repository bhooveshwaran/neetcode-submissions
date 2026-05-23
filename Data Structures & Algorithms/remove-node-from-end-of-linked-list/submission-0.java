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
        ListNode tail = head;
        int size = 0;
        //Find the size
        while(tail != null){
            tail = tail.next;
            size++;
        }
        // loop i from 1 -> size-(n-1) 
        int i = 1;
        int target = size - (n - 1);
        if(i == target){
            head = head.next;
        }else{
            ListNode temp = head;
            while (i!=target-1){
                temp = temp.next;
                i++;
            }
            ListNode save = temp.next.next;
            temp.next = save;
        }
        return head;
    }
}
