package com.cier.one;

import java.util.HashMap;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class T36 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        HashMap<ListNode,Integer> map = new HashMap<>();
        while (cur1 != null){
            map.put(cur1,1);
            cur1 = cur1.next;
        }
        while (cur2 != null){
            if (map.containsKey(cur2)){
                return cur2;
            }
            cur2 = cur2.next;
        }
        return null;
    }
}
