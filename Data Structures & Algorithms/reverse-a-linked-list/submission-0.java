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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode previous = null;

        while (current!= null) {
            ListNode next = current.next;

            current.next = previous;
            //System.out.println("Current: " + current);
            previous = current;
            current = next;
        }
        return previous;
    }
}
