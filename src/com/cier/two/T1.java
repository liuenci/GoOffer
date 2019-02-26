package com.cier.two;

/**
 * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class T1 {
    /**
     * 1 2 3
     * 2 3 4
     * 3 4 5
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        int rowLength = array.length;
        int colLength = array[0].length;
        int i = rowLength - 1;
        int j = 0;
        while (i >= 0 && j <= colLength - 1) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target){
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}
