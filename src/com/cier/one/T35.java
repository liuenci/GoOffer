package com.cier.one;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class T35 {
    int cnt;
    public int InversePairs(int [] array) {
        cnt = 0;
        if (array != null){

        }
        return cnt;
    }
    public void merge(int[] a,int start, int mid,int end){
        int[] tmp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j]){
                tmp[k++] = a[i++];
            }else{
                tmp[k++] = a[j++];
                cnt += mid - i + 1;
            }
        }
        while (i <= mid){
            tmp[k++] = a[i++];
        }
        while (j <= end){
            tmp[k++] = a[j++];
        }
        for (k = 0; k < tmp.length; k++){
            a[start + k] = tmp[k];
        }
    }
}
