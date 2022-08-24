/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode p1 = head.next;
        ListNode p2 = head;

        while (p2 != p1) {
            if (p1 == null || p1.next == null) {
                return false;
            }
            p2 = p2.next;
            p1 = p1.next.next;
        }

        return true;

    }
}