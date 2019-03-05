package com.cier.two;

/**
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }else if (list2 == null){
            return list1;
        }
        ListNode mergeNode = null;
        if (list1.val < list2.val) {
            mergeNode = list1;
            mergeNode.next = Merge(list1.next, list2);
        }else {
            mergeNode = list2;
            mergeNode.next = Merge(list1, list2.next);
        }
        return mergeNode;
    }
}
