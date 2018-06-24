package com.cier.offer;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * [1,2,3,4,5,6,7,8]
 * k = 2
 */
public class T14 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (k <= 0) {
            return null;
        }
        if (head == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        stack.push(head);
        int temp = 0;
        while (!stack.empty()) {
            ListNode listNode = stack.pop();
            temp++;
            if (temp == k) {
                return listNode;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
