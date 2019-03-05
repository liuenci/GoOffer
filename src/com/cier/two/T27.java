package com.cier.two;

import java.util.ArrayList;

/**
 * @ClassName T27
 * @Author liuenci
 * @Date 2019/3/5 下午5:05
 * @Version 1.0
 * https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&rp=2&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
    /**
     * 分析
     * str:a [a]
     * str:ab [ab,ba]
     * str:abc [abc,acb,bac,bca,cab,cba]
     */
    private String swap(String str, int i, int j){
        char[] arr = str.toCharArray();
        char ichar = arr[i];
        char jchar = arr[j];
        arr[i] = jchar;
        arr[j] = ichar;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        T27 t27 = new T27();
        System.out.println(t27.swap("123",0,2));
    }
}
