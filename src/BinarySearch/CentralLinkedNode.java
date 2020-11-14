package BinarySearch;

import java.util.*;
class CentralLinkedNode {
    public int solve(LLNode node) {
        LLNode slow = node, fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}