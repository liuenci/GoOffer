package com.cier.two;

/**
 * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 0 1 1 2 3
 */
public class T7 {
    public int Fibonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int index = 3;
        while (index <= n) {
            a = b;
            b = c;
            c = a + b;
            index++;
        }
        return c;
    }
}
