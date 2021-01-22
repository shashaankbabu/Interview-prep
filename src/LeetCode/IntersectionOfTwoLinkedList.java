package LeetCode;

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while(aPointer != bPointer) {
            if(aPointer == null) {
                aPointer = headB;
            } else {
                aPointer = aPointer.next;
            }

            if(bPointer == null) {
                bPointer = headA;
            } else {
                bPointer = bPointer.next;
            }
        }
        return aPointer;
    }
}