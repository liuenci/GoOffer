package com.cier.two;

import java.util.Arrays;

/**
 * @ClassName T28
 * @Author liuenci
 * @Date 2019/3/5 下午5:22
 * @Version 1.0
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&tqId=11181&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int num = array[array.length / 2];
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                times++;
            }
        }
        return times > array.length / 2 ? num : 0;
    }
}
