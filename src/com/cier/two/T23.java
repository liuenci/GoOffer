package com.cier.two;

/**
 * https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *   2
 *  1 3
 *
 * 1 3 2
 * @author liuenci
 */
public class T23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence,0,sequence.length - 1);
    }

    private boolean verify(int[] sequence,int first,int last){
        if (last - first <= 1) {
            return true;
        }
        int rootVal = sequence[last];
        int curIndex = first;
        while (curIndex < last && sequence[curIndex] <= rootVal) {
            curIndex++;
        }
        for (int i = curIndex; i < last; i++) {
            if (sequence[i] < rootVal) {
                return false;
            }
        }
        return verify(sequence,first, curIndex - 1) && verify(sequence, curIndex, last - 1);
    }
}
