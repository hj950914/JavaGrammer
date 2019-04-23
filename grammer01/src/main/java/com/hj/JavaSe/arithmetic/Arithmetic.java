package com.hj.JavaSe.arithmetic;

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
}
