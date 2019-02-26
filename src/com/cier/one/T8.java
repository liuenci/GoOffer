package com.cier.one;

import java.util.HashMap;

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
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i < 20; i++) {
            System.out.println(t8.JumpFloor3(i,map));
        }
    }

    public int JumpFloor2(int target) {
        if (target == 1||target == 2) {
            return target;
        }
        return this.JumpFloor(target - 1) + this.JumpFloor(target - 2);
    }

    public int JumpFloor3(int target, HashMap<Integer,Integer> map) {
        if (target == 1||target == 2) {
            return target;
        }
        if (map.containsKey(target)){
            return map.get(target);
        }else{
            int value = this.JumpFloor3(target-1,map)+this.JumpFloor3(target-2,map);
            map.put(target,value);
            return value;
        }
    }
}
