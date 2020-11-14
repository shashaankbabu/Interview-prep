package LeetCode;

class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode currentNode = l3;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        if(l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }
        if(l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
        }

        return l3.next;
    }
}
