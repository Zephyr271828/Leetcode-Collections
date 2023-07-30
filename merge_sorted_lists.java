package Leetcode;

class ListNode{
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class merge_sorted_lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        ListNode head = new ListNode();
        ListNode curNode = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                curNode.next = list1;
                list1 = list1.next;
            } else{
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;
        }
        curNode.next = list1 == null? list2 : list1;
        return head.next;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        if (list1.val < list2.val) {
            ListNode newNode = new ListNode(list1.val, mergeTwoLists2(list1.next, list2));
            return newNode;
        } else {
            ListNode newNode = new ListNode(list2.val, mergeTwoLists2(list1, list2.next));
            return newNode;
        }
    }
}
