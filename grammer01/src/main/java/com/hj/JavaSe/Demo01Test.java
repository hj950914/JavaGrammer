package com.hj.JavaSe;

import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

import java.util.List;

/**
 * Author: hj
 * Date: 2018-12-31 00:42
 * Description: <描述>
 */
public class Demo01Test {

    @Test
    public void test01(){

        Demo01 demo01 = new Demo01();

        //demo01.YearTest01();
        //demo01.YearTest02();

        int[] a={2,10,14,19,51,71};
        int[] b={2,9,10,14,40,51};
        /*for(int result:demo01.ArrayCombine(a,b)){
            System.out.print(result+" ");
        }
        System.out.println();
        List<Integer> list=demo01.RemoveEqualArray(demo01.ArrayCombine(a,b));
        for (int i:list){
            System.out.print(i+" ");
        }*/

        //测试ArrayCombine2方法
        System.out.print("数组合并的时候进行消除相同元素:");
        int[] ints = demo01.ArrayCombine2(a, b);
        for (int i:ints){
            System.out.print(i+" ");
        }


        System.out.println();
        int []result=demo01.RemoveEqualArray2(demo01.ArrayCombine(a,b));
        for(int i:result){
            if (result==null){
                System.out.println("null");
            }
            System.out.print(i+" ");
        }

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
        int n=10;
        System.out.println(n+"的累加和:"+demo01.CumulationSum(n));


        System.out.println();
        int n1=5;
        System.out.println(n+"的阶乘:"+demo01.Factoriar(n1));


        System.out.println();
        int n2=5;
        System.out.println(n2+"的阶乘和为:"+demo01.FactoriarSum(n2));
    }

    @Test
    public void test02(){

        int[]a={11,10,12,21,13,31,17,14,87,14};

        Arithmetic arithmetic = new Arithmetic();
        System.out.println();
        System.out.print("结果");
        for (int value:arithmetic.sort1(a)) {
            System.out.print(value+" ");
        }
    }

}
