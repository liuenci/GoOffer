package com.cier.two;

/**
 * https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T9 {
    public int JumpFloorII(int target) {
        int num = 1;
        while (target != 1) {
            num <<= 1;
            target--;
        }
        return num;
    }
}
