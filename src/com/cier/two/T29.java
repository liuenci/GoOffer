package com.cier.two;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName T29
 * @Author liuenci
 * @Date 2019/3/5 下午5:26
 * @Version 1.0
 * https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tqId=11182&rp=2&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class T29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
