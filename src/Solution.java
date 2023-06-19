
public class Solution {

    /**
     * Rearranges a singly linked list such that all the odd-indexed nodes come before the even-indexed nodes.
     *
     * @param head the head node of the linked list
     * @return the head node of the rearranged linked list
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        // Iterate through the list, connecting the odd nodes and even nodes separately
        while (even != null && even.next != null) {
            odd.next = even.next; // Connect current odd node to the next odd node
            odd = odd.next; // Move to the next odd node
            even.next = odd.next; // Connect current even node to the next even node
            even = even.next; // Move to the next even node
        }

        odd.next = evenHead; // Link the tail of the odd list to the head of the even list
        return oddHead; // Return the head of the rearranged list
    }
}
