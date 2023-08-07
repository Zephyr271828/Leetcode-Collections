package Leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class HasCycle {
    public boolean hasCycle(ListNode head){
        ListNode a = head, b = head;
        while (a != null && b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            if (a == b) return true;
        }
        return false;
    }
}
