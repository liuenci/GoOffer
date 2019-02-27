package com.cier.two;

import java.util.Stack;

/**
 * https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *   2
 *  1 3
 *
 * @author liuenci
 */
public class T23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < sequence.length; i++) {
            stack.push(sequence[i]);
        }

        return false;
    }

    public static void main(String[] args) {


    }
}
