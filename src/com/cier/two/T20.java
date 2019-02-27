package com.cier.two;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author liuenci
 * 用例:
 * ["PSH3","MIN","PSH4","MIN","PSH2","MIN","PSH3","MIN","POP","MIN","POP","MIN","POP","MIN","PSH0","MIN"]
 *
 * 对应输出应该为:
 *
 * 3,3,2,2,2,3,3,0
 *
 * 你的输出为:
 *
 * 3,3,2,2,2,2,2,0
 */
public class T20 {
    Stack<Integer> stack = new Stack<>();
    /**
     * 用来存储 min 5 4 3 2 1 1 这种
     */
    Stack<Integer> minStack = new Stack<>();

    /**
     * push 到 stack 之前先判断 minStack 的栈顶是否是大于 push 进来的值，如果大于，则需要存到 minStack 中
     * @param node
     */
    public void push(int node) {
        if (minStack.isEmpty() || minStack.peek() >= node) {
            minStack.push(node);
        }
        stack.push(node);
    }

    /**
     * pop 之前先判断 栈顶的值是否小于等于 minStack 的值
     */
    public void pop() {
        if (top() <= minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
