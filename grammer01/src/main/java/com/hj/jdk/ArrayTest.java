package com.hj.jdk;

import org.junit.Test;

import java.util.Arrays;

/**
 * Author: hj
 * Date: 2019-03-14 00:14
 * Description: <数组的一些常用方法>
 */
public class ArrayTest {

    /*
     * 求数组长度的length方法
     * */
    @Test
    public void testLength() {
        int[] a = new int[5];
        System.out.println(a.length);//5
    }

    /*
     * 数组扩容(复制)的copyOf()方法和arraycopy()方法
     * */
    @Test
    public void testCopy() {
        /*
         * copyOf()方法：演示数组扩容
         * */
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("数组长度" + a.length);
        //扩容
        int[] b = Arrays.copyOf(a, 10);
        System.out.println("扩容之后数组长度为" + b.length);
        //插入新的数据
        b[7] = 7;
        for (Integer integer : b) {
            System.out.print(integer + "");
        }
        System.out.println();
        System.out.println("**********************************");
        System.out.println();

        /*
         * arraycopy()方法:演示数组复制
         * */
        int[] c = {1, 2, 3, 4, 5};
        int[] d=new int[c.length];
        //原数组,要复制的起始索引,新数组,新数组的起始索引,复制的长度
        System.arraycopy(c,0,d,0,c.length);
        System.out.print("数值复制后,数组d结果为:");
        for (Integer i:d){
            System.out.print(i+",");
        }
    }

}
