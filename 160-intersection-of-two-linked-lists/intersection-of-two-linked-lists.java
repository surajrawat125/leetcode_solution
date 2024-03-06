public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        
        while (lenB > lenA) { 
            lenB--;
            headB = headB.next;
        }
        
        while (headA != headB) {
            headA = headA.next; //next
            headB = headB.next;
        }
        return headA;
    }
    
    // length of the linked list
    private int getListLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
