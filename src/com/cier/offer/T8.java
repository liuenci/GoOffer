package com.cier.offer;

public class T8 {
    public int JumpFloor(int target) {
        if (target == 1||target == 2) {
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

    public static void main(String[] args) {
        T8 t8 = new T8();
        for (int i = 1; i < 20; i++) {
            System.out.println(t8.JumpFloor(i));
        }
    }

    public int JumpFloor2(int target) {
        if (target == 1||target == 2) {
            return target;
        }
        return this.JumpFloor(target - 1) + this.JumpFloor(target - 2);
    }
}
