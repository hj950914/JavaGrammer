package com.hj.JavaSe.arithmetic;

import org.junit.Test;

import java.util.Arrays;

/**
 * Author: hj
 * Date: 2019-01-03 16:50
 * Description: <经典算法>
 */
public class Arithmetic {

    /*冒泡排序
     * 每次排序将最大的值按照大小放在数组右边
     * */
    public int[] sort1(int[] ArrayValus) {
        int flag;
        for (int j = 0; j < ArrayValus.length - 1; j++) {
            for (int i = 0; i < ArrayValus.length - 1 - j; i++) {
                //左边大于右边,进行交换
                if (ArrayValus[i] > ArrayValus[i + 1]) {
                    flag = ArrayValus[i];
                    ArrayValus[i] = ArrayValus[i + 1];
                    ArrayValus[i + 1] = flag;
                }
            }
        }
        return ArrayValus;
    }

    public int[] sort2(int[] arrayValues) {
        int flag = 0;
        for (int i = 0; i < arrayValues.length - 1; i++) {
            // 1 23 4 5
            for (int j = 0; j < arrayValues.length - 1 - i; j++) {
                //左边比右边值大,则交换
                if (arrayValues[j] > arrayValues[j + 1]) {
                    flag = arrayValues[j];
                    arrayValues[j] = arrayValues[j + 1];
                    arrayValues[j + 1] = flag;
                }
            }
            System.out.println("第" + (i + 1) + "趟排序结果:" + Arrays.toString(arrayValues));
        }

        return arrayValues;
    }

    /**
     * 冒泡排序,按照从大到小
     */
    public static Integer[] sort3(Integer[] arrays) {
        int tmp;
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;
                }
            }
        }
        return arrays;
    }

    /**
     * 冒泡排序,从小到大
     */
    public static Integer[] sort(Integer[] arrays){
        int flag;
        for (int i=0;i<arrays.length-1;i++){
            for (int j=0;j<arrays.length-i-1;j++){
                //大的放右边
                if (arrays[j]>arrays[j+1]){
                    flag=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=flag;
                }
            }
        }
        return arrays;
    }

    /**
     * 插入排序
     */
    public static Integer[] sort4(Integer[] arrays) {
        for (int i = 1; i < arrays.length; i++) {
            int tmp = arrays[i];
            for (int j = i; j > 0; j--) {
                if (arrays[j - 1] > tmp) {
                    arrays[j] = arrays[j - 1];
                    if (j == 1) {
                        arrays[j - 1] = tmp;
                        break;
                    }
                } else {
                    arrays[j] = tmp;
                    break;
                }
            }
        }
        return arrays;
    }


    /**
     * 归并排序
     *
     * @param arrayA
     * @param left
     * @param mid
     * @param right
     */
    public void merge(Integer[] arrayA, Integer left, int mid, Integer right) {
        Integer[] tmp = new Integer[arrayA.length];
        int p1 = left, p2 = mid + 1, k = left;
        while (p1 <= mid && p2 <= right) {
            /*if (p1 <= mid) {
                tmp[k++] = arrayA[p1++];
                continue;
            }
            if (p2 <= right) {
                tmp[k++] = arrayA[p2++];
                continue;
            }*/
            if (arrayA[p1] <= arrayA[p2]) {
                tmp[k++] = arrayA[p1++];
            } else {
                tmp[k++] = arrayA[p2++];
            }
        }
        while (p1 <= mid) tmp[k++] = arrayA[p1++];
        while (p2 <= right) tmp[k++] = arrayA[p2++];
        System.out.println(Arrays.toString(tmp));
    }

    public void mergeSort(Integer[] arrayA, Integer start, Integer end) {
        //当子序列中只有一个元素时结束递归
        if (start < end) {
            int mid = (start + end)/2;
            mergeSort(arrayA, start, mid);//左侧递归
            mergeSort(arrayA, mid + 1, end);//右侧递归
            merge(arrayA, start, mid, end);//合并
        }
    }


    /**
     * 将2个有序数组合并算法
     */
    public Integer[] mergeOne(Integer[] arraysA, Integer[] arraysB) {
        //i表示arraysA下标,j表示arraysB下标,k表示arraysNew下标
        int i = 0, j = 0, k = 0;
        Integer[] arraysNew = new Integer[arraysA.length + arraysB.length];
        //定义除去空值的数组
        Integer[] arrays;
        while (arraysA.length > i || arraysB.length > j) {
            if (arraysA.length <= i) {
                arraysNew[k++] = arraysB[j++];
                continue;
            }
            if (arraysB.length <= j) {
                arraysNew[k++] = arraysA[i++];
                continue;
            }
            if (arraysA[i] <= arraysB[j]) {
                int flag = i;
                arraysNew[k++] = arraysA[i++];
                if (arraysA[flag] == arraysB[j]) {
                    j++;
                }
            } else {
                arraysNew[k++] = arraysB[j++];
            }
        }
        arrays = new Integer[k];
        //除去数组中null值
        System.arraycopy(arraysNew, 0, arrays, 0, k);
        return arrays;
    }


    @Test
    public void test1() {
        Integer[] a = {3, 4, 6, 7, 8, 12};
        Integer[] b = {2, 3, 4, 5, 6, 7, 8, 12, 13, 14};
        Integer[] c = {2, 6, 9, 4, 1, 2, 34, 6, 7, 89};
        //Integer[] integers = new Arithmetic().mergeOne(a, b);
        //System.out.println(Arrays.toString(integers));
        //new Arithmetic().mergeSort(c, 0, c.length - 1);
        System.out.println(Arrays.toString(Arithmetic.sort(c)));
        //System.out.println(Arrays.toString(Arithmetic.sort4(c)));
    }
}