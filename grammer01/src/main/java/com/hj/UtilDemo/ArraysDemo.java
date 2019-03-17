package com.hj.UtilDemo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2019-03-17 17:26
 * Description: <Arrays类的常用方法>
 */
public class ArraysDemo {

    /*
     * 1:copyOf()--数值复制扩容
     * 2:asList()--数组转集合
     * */
    @Test
    public void testOne() {

        /*
         * 1:copyOf()--数值复制扩容
         * */
        {
            int[] array1 = {1, 2, 3, 4, 5, 5, 6};
            System.out.println("扩容前长度:" + array1.length);
            //把array1数组扩容
            int[] array2 = Arrays.copyOf(array1, array1.length + 20);
            //输出array2
            System.out.println("扩容后长度:" + array2.length);
        }

        /*
         * 2:asList()--数组转集合
         * */
        {
            //方式1
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            list.forEach(e -> System.out.print(e + " "));
            System.out.println();
            //方式2
            int[] array3 = {1, 2, 3, 4, 5};
            list = Arrays.stream(array3).boxed().collect(Collectors.toList());
            list.forEach(e -> System.out.print(e + " "));

        }
    }

}
