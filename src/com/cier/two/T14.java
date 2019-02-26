package com.cier.two;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (k != 1 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        return stack.isEmpty() ? null : stack.pop();
    }
}
