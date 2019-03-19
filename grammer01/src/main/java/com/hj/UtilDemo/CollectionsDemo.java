package com.hj.UtilDemo;

import com.sun.jdi.IntegerType;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2019-03-17 18:14
 * Description: <Collections类常用方法(基本都是对List集合进行操作)>
 */
public class CollectionsDemo {

    /*
     *  1:sort()--对<集合>进行排序
     *  2:shuffle()--对集合进行随机排序
     *  3:binarySearch()--查找指定集合中的元素，返回所查找元素的索引
     *  4:replaceAll()--替换批定元素为某元素,若要替换的值存在刚返回true,反之返回false
     * */
    @Test
    public void testOne() {
        /*
         * 1:sort()--对集合进行排序
         * */
        {
            int[] a = {1, 2, 9, 4, 5, 6};
            //整形数组转list
            List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
            //对list集合进行排序
            Collections.sort(list);
            System.out.print("集合增序排序:");
            list.forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "**********************************************************");
        }

        /*
         * 2:shuffle()--对集合进行随机排序
         * */
        {
            String[] str = {"a", "b", "c", "d"};
            List<String> list = new ArrayList<>(Arrays.asList(str));
            //随机排列3次
            System.out.println("集合随机排序结果:");
            for (int i = 0; i < 3; i++) {
                Collections.shuffle(list);
                list.forEach(e -> System.out.print(e + " "));
                System.out.println();
            }
            System.out.println("**********************************************************");

        }

        /*
         * 3:binarySearch()--查找指定集合中的元素，返回所查找元素的索引
         * */
        {
            int[] a = {1, 2, 3, 4, 5, 6};
            List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
            System.out.print("元素2所在列表中的索引:" + Collections.binarySearch(list, 2));
            System.out.println("\n" + "**********************************************************");
        }

        /*
         * 4:replaceAll()--替换批定元素为某元素,若要替换的值存在刚返回true,反之返回false
         * */
        {
            String[] str = {"a", "b", "c", "d"};
            //可以使用下面的简写List<String> list=new ArrayList<>(Arrays.asList(str));
            List<String> list = Arrays.asList(str);
            System.out.println("集合:");
            list.forEach(e -> System.out.print(e + " "));
            //将list集合里面的"b"替换成"bb"
            boolean result = Collections.replaceAll(list, "b", "bb");
            if (result) {
                System.out.println("\n" + "元素b替换成功,新集合为:");
                list.forEach(e -> System.out.print(e + " "));
            } else {
                System.out.println("替换失败,原集合为:");
                list.forEach(e -> System.out.print(e + " "));
            }
            System.out.println("\n" + "**********************************************************");
        }
    }


    /*
     * 5:reverse()--反转集合中元素的顺序
     * 6:rotate()--集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来
     * 7:copy()--将集合B中的元素全部复制到A中,并且覆盖相应索引的元素
     * */
    @Test
    public void testTwo() {
        /*
         * 5:reverse()--反转集合中元素的顺序
         * */
        {
            int[] a = {1, 2, 3, 6, 5, 4};
            List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
            System.out.println("原集合:");
            list.forEach(e -> System.out.print(e + " "));
            Collections.reverse(list);
            System.out.println("\n" + "集合元素反转:");
            list.forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "******************************************************");
        }

        /*
         * 6:rotate()--集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来
         * */
        {
            String[] str = {"a", "b", "c", "d"};
            List<String> list = Arrays.asList(str);
            System.out.println("原集合:");
            list.forEach(e -> System.out.print(e + " "));
            Collections.rotate(list, 1);
            System.out.println("\n" + "元素旋转1位:");
            list.forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "******************************************************");
        }

        /*
         * 7:copy()--将集合listB中的元素全部复制到listA中,并且覆盖相应索引的元素
         * */
        {
            int[] a = {5, 6, 7, 8, 9, 10, 11};
            List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
            int[] b = {0, 1, 2, 3, 4};
            List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
            //开始复制
            System.out.println("集合复制:");
            Collections.copy(listA, listB);
            listA.forEach(e -> System.out.print(e + " "));//结果0,1,2,3,4,10,11
            System.out.println("\n" + "************************************************************");
        }
    }


    /*
     * 8:swap()--交换集合中指定元素索引的位置
     * 9:fill()--用对象obj替换集合list中的所有元素
     * 10:nCopies()--返回大小为n的List，List不可改变【其中的所有引用都指向obj】
     * */
    @Test
    public void testThree() {
        /*
         * 8:swap()--交换集合中指定元素索引的位置
         * */
        {
            String[] str = {"a", "b", "c", "d"};
            List<String> listStr = Arrays.asList(str);
            System.out.println("原集合为:");
            listStr.forEach(e -> System.out.print(e + " "));
            //交换2,3索引
            Collections.swap(listStr, 2, 3);
            System.out.println("\n" + "交换集合中指定元素索引的位置(交换2,3索引):");
            listStr.forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "********************************************************");
        }

        /*
         * 9:fill()--用对象obj替换集合list中的所有元素
         * */
        {
            int[] arrayA = {1, 2, 3, 4, 5};
            List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
            System.out.println("原集合是:");
            listA.forEach(e -> System.out.print(e + " "));
            Collections.fill(listA, 0);
            System.out.println("\n" + "用0替换集合中的所有元素,替换后集合为:");
            listA.forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "********************************************************");
        }

        /*
         * 10:nCopies()--返回大小为n的List，List不可改变【其中的所有引用都指向obj】
         * */
        {
            //定义一个大小为6的list集合,里面元素为6个"mac"
            Collections.nCopies(6, "mac").forEach(e -> System.out.print(e + " "));
            System.out.println("\n" + "********************************************************");
        }
    }
}
