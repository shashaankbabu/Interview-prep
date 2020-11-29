package LeetCode;

class RemoveElemFromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode current = new ListNode(-1);
        current.next = head;
        head = current;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head.next;
    }
}