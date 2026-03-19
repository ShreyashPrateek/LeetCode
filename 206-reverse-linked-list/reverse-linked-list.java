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

        ListNode prev = null;
        ListNode current = head;

        while (current != null)
        {
            ListNode next = current.next; // next ko store krega
            current.next = prev; // reverse link
            prev = current; // previous ko move krega
            current = next; // current ko move
        }
        return prev;
    }
}