package Leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = 0, lB = 0;
        ListNode curNode = headA;
        while (curNode != null){
            lA++;
            curNode = curNode.next;
        }
        curNode = headB;
        while (curNode != null){
            lB++;
            curNode = curNode.next;
        }
        for(int i = 0; i < lA - lB; i++) headA = headA.next;
        for(int i = 0; i < lB - lA; i++) headB = headB.next;
        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
