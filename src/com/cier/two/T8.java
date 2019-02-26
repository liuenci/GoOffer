package com.cier.two;

/**
 * https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T8 {
    public int JumpFloor(int target) {
        if (target == 1 || target == 2) {
            return target;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        for (int i = 3; i <= target; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return c;
    }
}
