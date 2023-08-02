package Leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head){
        ListNode curNode = head;
        while (true){
            if (curNode.next == null) break;
            if (curNode.next.val == curNode.val) curNode.next = curNode.next.next;
            else curNode = curNode.next;
        }
        return head;
    }
}
