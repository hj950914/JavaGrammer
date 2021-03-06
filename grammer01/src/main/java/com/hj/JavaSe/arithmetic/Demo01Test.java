package com.hj.JavaSe.arithmetic;

import org.junit.Test;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Author: hj
 * Date: 2018-12-31 00:42
 * Description: <描述>
 */
public class Demo01Test {

    Demo01 demo01 = new Demo01();

    @Test
    public void test03() {
        int[] a = {2, 10, 14, 19, 51, 71};
        int[] b = {2, 9, 10, 14, 40, 51};
        for (int result : demo01.ArrayCombine(a, b)) {
            System.out.print(result + " ");
        }
        System.out.println();
        List<Integer> list = demo01.RemoveEqualArray(demo01.ArrayCombine(a, b));
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        int[] result = demo01.RemoveEqualArray2(demo01.ArrayCombine(a, b));
        for (int i : result) {
            if (result == null) {
                System.out.println("null");
            }
            System.out.print(i + " ");
        }
    }

    @Test
    public void test01() {
        int[] a = {2, 10, 14, 19, 51, 71};
        int[] b = {2, 9, 10, 14, 40, 51};
        //测试ArrayCombine2方法
        System.out.print("数组合并的时候进行消除相同元素:");
        int[] ints = demo01.ArrayCombine2(a, b);
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        //测试ArrayCombine方法a
        System.out.print("数组合并的时候进行消除相同元素:");
        int[] ints1 = demo01.arrayCombine(a, b);
        for (int i : ints1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("使用工具类合并数组:");
        Integer[] a1 = {2, 10, 14, 19, 51, 71};
        Integer[] a2 = {2, 9, 10, 14, 40, 51};
        List<Integer> list = demo01.arrayCombine3(a1, a2);
        System.out.println((list));
        System.out.println();

        System.out.println("使用apache-commons包:");
        List<Integer> list1 = demo01.arrayCombine4(a1, a2);
        System.out.println(list1);
        System.out.println();


        System.out.println();
        System.out.print("最大值:");
        System.out.println(demo01.ReturnArrayMaxValue(a));
        /*
         *
         * 2 2 9 10 10 14 19 40 51 51 71
         *
         * 2 9 10 14
         *
         *
         * */
        System.out.println();
        int n = 10;
        System.out.println(n + "的累加和:" + demo01.CumulationSum(n));


        System.out.println();
        int n1 = 5;
        System.out.println(n + "的阶乘:" + demo01.Factoriar(n1));


        System.out.println();
        int n2 = 5;
        System.out.println(n2 + "的阶乘和为:" + demo01.FactoriarSum(n2));
    }

    @Test
    public void test02() {

        int[] a = {11, 10, 12, 21, 13, 31, 17, 14, 87, 14, 1};

        Arithmetic arithmetic = new Arithmetic();
        System.out.println();
        int[] arrays = arithmetic.sort2(a);
        System.out.print("最终结果" + Arrays.toString(arrays));

    }

}
