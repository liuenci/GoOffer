package com.cier.one;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class T9 {

    public static void main(String[] args) {
        T9 t9 = new T9();
        System.out.println(t9.JumpFloorII(3));
    }

    public int JumpFloorII(int target) {
        if (target == 1 || target == 2) {
            return target;
        }else{
            return 2*this.JumpFloorII(target-1);
        }
    }

    public int JumpFloorII2(int target) {
        return 1<<(target-1);
    }
}
