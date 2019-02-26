package com.cier.two;

import java.util.ArrayList;
import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 1 -> 2 -> 3 -> 4
 */
public class T3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        add(list,listNode);
        return list;
    }

    private void add(ArrayList<Integer> list, ListNode listNode){
        if (listNode != null) {
            add(list, listNode.next);
            list.add(listNode.val);
        }
    }
}
