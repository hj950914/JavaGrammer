package com.hj.JavaSe.arithmetic;


import org.apache.commons.lang3.ArrayUtils;

import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2018-12-31 00:31
 * Description: <小算法练习>
 */
public class Demo01 {

    int year = 1995;

    //输入一个年份,判断是否为闰年
    public void YearTest01() {
        System.out.println("进入YearTest()");
        //System.out.print("请输入年份:");
        //Scanner scanner = new Scanner(System.in);
        //int year=scanner.nextInt();
        /*闰年的判断规则,可以被4整除但是不能被100整除的年份,
         * 或者可以被400整除
         */
        if ((((year%4 == 0) && (year%100 != 0)) || year%400 == 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }

    }

    //输入一个年份,判断是否为闰年
    public void YearTest02() {
        if (((year%4 == 0) & (year%100 != 0)) | (year%400 == 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }
        ///*
        //
        //
        //
        // int/*/*/*/*/**/*/*/*/*/*/
        //equals()
        ///**//*/**/*//**/
        ///**/
        /*if {
            //return;
        }*//**/

    }


    //数组合并算法
    public int[] ArrayCombine(int ArrayOne[], int ArrayTwo[]) {
        //定义一个新的数组,长度等于2个需要合并的数组的总长度
        int NewArray[] = new int[ArrayOne.length + ArrayTwo.length];
        //i是ArrayOne数组下标,j是ArrayTwo数组下标,k是NewArray数组下标
        int i = 0, j = 0, k = 0;
        while (i < ArrayOne.length && j < ArrayTwo.length) {
            if (ArrayOne[i] <= ArrayTwo[j]) {
                NewArray[k++] = ArrayOne[i++];
            } else {
                NewArray[k++] = ArrayTwo[j++];
            }
        }
        //当2个数组其中一个数组合并完之后,将剩下的数组继续合并到新数组
        while (i < ArrayOne.length) {
            NewArray[k++] = ArrayOne[i++];
        }
        while (j < ArrayTwo.length) {
            NewArray[k++] = ArrayTwo[j++];
        }

        return NewArray;
    }

    /*
     * @see: 数组合并算法2
     */
    public int[] ArrayCombine2(int ArrayOne[], int ArrayTwo[]) {
        //定义一个新的数组,长度等于2个需要合并的数组的总长度
        int NewArray[] = new int[ArrayOne.length + ArrayTwo.length];
        //定义一个新数组用来接收已经除去空值的数组
        int NewArray2[];
        //i是ArrayOne数组下标,j是ArrayTwo数组下标,k是NewArray数组下标
        int i = 0, j = 0, k = 0;
        while (i < ArrayOne.length || j < ArrayTwo.length) {
            //如果数组ArrayOne遍历完
            if (i >= ArrayOne.length) {
                NewArray[k++] = ArrayTwo[j++];
                continue;
            }
            //如果数组ArrayTwo遍历完
            if (j >= ArrayTwo.length) {
                NewArray[k++] = ArrayOne[i++];
                continue;
            }
            //没有数组遍历完
            /*if (i < ArrayOne.length && j < ArrayTwo.length) {
            }*/
            if (ArrayOne[i] <= ArrayTwo[j]) {
                int i1 = i;
                NewArray[k++] = ArrayOne[i++];
                if (ArrayOne[i1] == ArrayTwo[j]) {
                    j++;
                }
            } else {
                NewArray[k++] = ArrayTwo[j++];
            }
            //有数组遍历完
            /*else{
                if (i < ArrayOne.length) {
                    NewArray[k++] = ArrayOne[i++];
                }
                if (j < ArrayTwo.length) {
                    NewArray[k++] = ArrayTwo[j++];
                }

            }*/

        }
        NewArray2 = new int[k];
        System.arraycopy(NewArray, 0, NewArray2, 0, k);
        return NewArray2;
    }

    /*
     * 数组合并,借助工具类
     * */
    public List<Integer> arrayCombine3(Integer[] arrayOne, Integer[] arrayTwo) {
        Integer[] integers = new Integer[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne, 0, integers, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, integers, arrayOne.length, arrayTwo.length);
        Set<Integer> set = new HashSet<>(Arrays.asList(integers));
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    /*
     * 数组合并,借助Apache-commons包
     * */
    public List<Integer> arrayCombine4(Integer[] arrayOne, Integer[] arrayTwo) {
        //数组合并
        Integer[] addAll = ArrayUtils.addAll(arrayOne, arrayTwo);
        //去除重复
        Set<Integer> set = new HashSet<>(Arrays.asList(addAll));
        //排序
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    //消除数组中相同元素1
    public List RemoveEqualArray(int ArrayOne[]) {

        //定义一个list用来存放新的数组
        List<Integer> ListOne = new ArrayList<>();
        for (int i = 0; i < ArrayOne.length; i++) {
            int flag = 0;
            for (int j = 0; j < ListOne.size(); j++) {
                //如果存在相同元素,则做个标记
                if (ArrayOne[i] == ListOne.get(j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ListOne.add(ArrayOne[i]);
            }
        }
        return ListOne;
    }

    //消除数组中相同元素2
    public int[] RemoveEqualArray2(int ArrayOne[]) {

        //定义一个新数组
        int[] ArrayTwo = new int[ArrayOne.length];
        //定义新数组的下标
        int k = 0;

        for (int i = 0; i < ArrayOne.length; i++) {
            int flag = 0;
            for (int j = 0; j < ArrayTwo.length; j++) {
                //如果出现相同元素
                if (ArrayOne[i] == ArrayTwo[j]) {
                    flag = 1;
                    break;
                }
            }
            //如果不存在相同元素,就将元素放入新数组
            if (flag == 0) {
                ArrayTwo[k++] = ArrayOne[i];
            }
        }


        return ArrayTwo;
    }

    //求数组中的最大值
    public int ReturnArrayMaxValue(int[] ArrayValues) {

        int max = ArrayValues[0];
        for (int i = 1; i < ArrayValues.length; i++) {
            if (max < ArrayValues[i]) {
                max = ArrayValues[i];
            }
        }

        return max;


        /*//变量交换
        int flag=0;
        int Max=0;
        for (int i=0;i<ArrayValues.length;i++){
            if(i==ArrayValues.length-1){
                Max= ArrayValues[i];
                break;
            }
            //如果数组左边的数大于等于右边的数,就交换
            if (ArrayValues[i]>=ArrayValues[i+1]){
                flag=ArrayValues[i];
                ArrayValues[i]=ArrayValues[i+1];
                ArrayValues[i+1]=flag;
            }
        }

        return Max;*/
    }

    //求某个数字的累加
    public int CumulationSum(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    //求某个数字的阶乘 n!
    public int Factoriar(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    //求阶乘的累加和1!+2!+3!+n!
    public int FactoriarSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //求某一个数的阶乘
            sum += Factoriar(i);
        }
        return sum;
    }


    //练习方法ß
    public void Practice() {
        int[] a = {1, 2};
        String[] s = {"1", "2"};
        System.out.println(a);
        int i = 9;
        float f = i;
    }

}
