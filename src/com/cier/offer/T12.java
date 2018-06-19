package com.cier.offer;

public class T12 {
    /**
     * 最菜的菜鸡会用这种方法1
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        return Math.pow(base,exponent);
    }

    public double Power1(double base, int exponent) {
        double temp = 1;
        for (int i = 1;i <= Math.abs(exponent);i++){
            temp *= base;
        }
        return exponent < 0 ? (1/temp) :temp;
    }
}
