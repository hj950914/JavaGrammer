package com.hj.JavaSe.arithmetic;

/**
 * Author: hj
 * Date: 2019-01-03 16:50
 * Description: <经典算法>
 */
public class Arithmetic {

    /*冒泡排序
    * 每次排序将最大的值按照大小放在数组右边
    * */
    public int[] sort1(int[] ArrayValus){
        int flag;
        for (int j=0;j<ArrayValus.length-1;j++){
            for (int i=0;i<ArrayValus.length-1-j;i++){
                //左边大于右边,进行交换
                if (ArrayValus[i]>ArrayValus[i+1]){
                    flag=ArrayValus[i];
                    ArrayValus[i]=ArrayValus[i+1];
                    ArrayValus[i+1]=flag;
                }
            }
        }
        return ArrayValus;
    }
}
