package com.cier.two;

import java.util.ArrayList;

/**
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 */
public class T19 {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int startX = 0;
        int startY = 0;
        int endX = matrix.length;
        int endY = matrix[0].length;

        while (startX <= endX && startY <= endY ) {
            printCircle(matrix, startX, startY, endX, endY);
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return list;
    }

    /**
     * 循环打印
     * @param matrix
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     */
    private void printCircle(int[][] matrix, int startX, int startY, int endX, int endY) {
        /**
         * 只有一列的情况
         */
        if (startX == endX) {
            for (int i = startY; i < endY; i++) {
                list.add(matrix[i][startX]);
            }
            return;
        }
        /**
         * 只有一行的情况
         */
        if (startY == endY) {
            for (int i = startX; i < endX; i++) {
                list.add(matrix[startY][i]);
            }
            return;
        }
        /**
         * 从左往右
         * 行固定
         */
        for (int i = startX; i < endX; i++) {
            list.add(matrix[startY][i]);
        }
        /**
         * 从上往下
         * 列固定
         */
        for (int i = startY; i < endY; i++) {
            list.add(matrix[i][endX]);
        }
        /**
         * 从右往左
         * 行固定
         */
        for (int i = endY; i > startY; i--) {
            list.add(matrix[i][startX]);
        }
        for (int i = endX; i > startX; i--) {
            list.add(matrix[startY][i]);
        }
    }

    /**
     * 1 2
     * 3 4
     * @param args
     */
    public static void main(String[] args) {
        int[][] m = new int[][]{{1}};
        T19 t19 = new T19();
        t19.printMatrix(m);
    }
}
