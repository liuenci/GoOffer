package com.cier.two;

import java.util.LinkedList;

/**
 * https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T13 {
    public void reOrderArray(int [] array) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                list1.add(array[i]);
            }else {
                list2.add(array[i]);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            array[i] = list1.get(i);
        }
        for (int i = list1.size(),j = 0; i < array.length; i++,j++) {
            array[i] = list2.get(j);
        }
    }

    public static void main(String[] args) {
        T13 t13 = new T13();
        t13.reOrderArray(new int[]{1,2,3,4,5,6,7});
    }
}
