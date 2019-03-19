package com.hj.UtilDemo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2019-03-17 17:26
 * Description: <Arrays类的常用方法(基本都是对数组进行操作)>
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


    /*
     *  3:fill()--用指定元素填充整个数组（会替换掉数组中原来的元素）
     *  4:sort()----排序(默认升序),还可以使用自定义比较器
     *  5:parallelSort--对数组元素进行排序(并行排序),当数据规模较大时，会有更好的性能
     * */
    @Test
    public void testTwo() {
        /*
         * 3:fill()--用指定元素填充整个数组
         * */
        {
            int[] a = {1, 2, 3, 4};
            Arrays.fill(a, 101010);
            System.out.println("用指定元素填充整个数组：" + Arrays.toString(a));
            int[] b = {1, 2, 3, 4};
            Arrays.fill(b, 0, 1, 10101010);
            System.out.println("用指定元素填充数组,规定填充哪些索引：" + Arrays.toString(b));
            String[] str = {"a", "b", "c"};
            Arrays.fill(str, "test");
            System.out.println("用指定元素填充整个数组：" + Arrays.toString(str));
            System.out.println("************************************************************");
        }

        /*
         * 4:sort()--排序(默认升序),还可以使用自定义比较器
         * */
        {
            int[] a = {3, 1, 5, 2};
            Arrays.sort(a);
            System.out.println("未使用自定义比较器:" + Arrays.toString(a));
        }

        /*
         * 5:parallelSort--排序
         * */
        {
            int[] a = {3, 1, 5, 2};
            Arrays.parallelSort(a);
            System.out.println("使用parallelSort方法进行排序:" + Arrays.toString(a));
        }
    }


    /*
     * 6:hashCode()--根据指定数组的内容,返回哈希码
     * 7:Stream()--返回数组的流Stream,然后就可以使用Stream相关的操作
     * */
    @Test
    public void testThree() {
        /*
         * 6:hashCode()--根据指定数组的内容,返回哈希码
         * */
        {
            int[] a = {1};
            int[] b = {1};
            System.out.println("数组a的hashode值:" + Arrays.hashCode(a));
            System.out.println("数组b的hashode值:" + Arrays.hashCode(b));
            System.out.println("******************************************");
        }
        /*
         * 7:返回数组的流Stream，然后我们就可以使用Stream相关的许多方法了
         * */
        {
            int[] a={1,2,3,4,5,5};
            List<Integer> list= Arrays.stream(a).boxed().collect(Collectors.toList());
            list.forEach(e -> System.out.print(e+" "));
        }
    }


}
