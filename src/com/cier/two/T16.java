package com.cier.two;

/**
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        ListNode node = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode listNode = new ListNode(list1.val);
                node.next = listNode;
                list1 = list1.next;
            } else {
                ListNode listNode = new ListNode(list2.val);
                node.next = listNode;
                list2 = list2.next;
            }
        }
        return node;
    }
}
