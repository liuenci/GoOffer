package com.cier.two;

/**
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author liuenci
 */
public class T15 {
    public ListNode ReverseList(ListNode head) {
        // 如果少于两个节点就无需翻转链表
        if (head == null || head.next == null) {
            return head;
        }
        // 假设链表为 1 -> 2 -> 3
        // p = head = 1
        ListNode p = head;
        // q = head.next = 2
        ListNode q = head.next;
        ListNode r = null;
        // 1 -> null
        head.next = null;

        while (q != null) {
            // r = q.next = 3
            r = q.next;
            // q.next = 1
            q.next = p;
            // p = q = 2
            p = q;
            // q = r = 3
            q = r;
        }
        return p;
    }

    public ListNode ReverseList2(ListNode head) {
        // 如果少于两个节点就无需翻转链表
        if (head == null || head.next == null) {
            return head;
        }
        // 假设链表为 1 -> 2 -> 3
        ListNode node = ReverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        T15 t15 = new T15();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        t15.ReverseList2(node1);
        System.out.println("end");
    }
}
