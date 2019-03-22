package com.hj.UtilDemo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2019-03-22 16:04
 * Description: <集合练习1>
 */
public class DemoOne {
    /*
     * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
     * */
    @Test
    public void testOne() {
        //定义随机数对象
        Random random = new Random();
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            //随机数存入数组
            result[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(result));
        //大于等于10的数字放到一个list集合中
        System.out.print("元素小于10的有:");
        List<Integer> list = Arrays.stream(result).boxed()
                .filter(e -> {
                    //这里使用了过滤器,元素小于10就过滤不用返回,大于等于10的元素return true
                    if (e < 10) {
                        System.out.print(e + " ");
                        return false;
                    } else {
                        return true;
                    }
                })
                .collect(Collectors.toList());
        System.out.println("\n" + "元素大于10的list集合为:" + list);
    }

    /*
     * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
     * (List接口里面有很多和String类相同的方法,比如 indexOf()，lastIndexOf())
     * */
    @Test
    public void testTwo() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(4);
        System.out.println(listTest(al, 2));
    }

    private int listTest(ArrayList<Integer> al, Integer s) {
        System.out.println(al);
        //第一次出现的索引
        int result = al.indexOf(s);
        if (result == -1) {
            return -1;
        } else {
            return result;
        }
    }

    /*
     *已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891",
     * "12347809933"}。将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印来。
     * */
    @Test
    public void testThree() {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        //strs数组存放在LinkedList中
        List<String> strList = new LinkedList<>(Arrays.asList(strs));
        //创建一个Set,把list集合添加进来消除相同元素
        Set<String> strSet = new HashSet<>(strList);
        //使用迭代器打印
        Iterator iterator = strSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //增强for循环打印
        for (String str : strSet) {
            System.out.print(str + " ");
        }
    }

}
