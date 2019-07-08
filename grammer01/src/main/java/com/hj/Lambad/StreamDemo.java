package com.hj.Lambad;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Author: hj
 * Date: 2019-03-15 16:44
 * Description: <Stream>
 */
public class StreamDemo {

    /*
     * Stream创建
     * */
    @Test
    public void testOne() {
        //通过数组创建Stream
        String[] arr = {"a", "b", "1", "2"};
        Stream<String> stream = Stream.of(arr);

        //通过集合创建Stream
        List<String> list = asList("a", "b", "1", "2");
        Stream<String> stream1 = list.stream();

        //通过generate方法创建Stream
        Stream<Integer> stream2 = Stream.generate(() -> 1);

        //通过iterate方法创建Stream
        Stream<Integer> stream3 = Stream.iterate(1, x -> x + 1);

        //通过其它创建Stream
        String str = "abcd";
        IntStream chars = str.chars();
        chars.forEach(x -> System.out.print(x + " "));
    }

    /*
     * Stream练习1
     * */
    @Test
    public void testTwo() {

        /*
         * 1:整形数组过滤基数
         * */
        int[] a = {1, 2, 3, 4, 5, 6};
        Arrays.stream(a).filter(x -> x%2 == 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println("\n" + "*************************************************");

        /*
         * 2:计算偶数和
         * */
        int[] b = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(b).filter(x -> x%2 == 0).sum();
        System.out.println("偶数和:" + sum);
        System.out.println("*************************************************");

        /*
         * 3:求最大值
         * */
        int[] c = {1, 2, 3, 4, 5, 6};
        //方法1
        int max = Stream.of(1, 2, 3, 4, 5, 6).max(Comparator.comparingInt(x -> x)).get();
        //方法2
        int max2 = Arrays.stream(c).max().getAsInt();
        System.out.println("最大值:" + max);
        System.out.println("最大值:" + max2);
        System.out.println("*************************************************");

        /*
         * 4:整形数组转List,然后倒序排序
         * */
        int[] d = {1, 2, 3, 4, 5, 6};
        //Integer[] d1 = {1, 2, 3, 4, 5, 6};
        //List<Integer> list1 = new ArrayList<>(Arrays.asList(d1));
        List<Integer> list = Arrays.stream(d).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //方式2List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("倒序排序结果:" + list);
        System.out.println("*************************************************");

        /*
         * 字符串数组转List
         * */
        String[] s = {"a", "b"};
        List<String> list1 = new ArrayList<>(Arrays.asList(s));
        System.out.println(list1);
        System.out.println("*************************************************");


    }

    /*
     * Stream练习2
     * */
    @Test
    public void testThree() {

        /*
         * 计算一个字符串中小写字母的个数
         * */
        {
            String str = "AbCdEfGhJkL";
            int count = (int) str.chars().filter(Character::isLowerCase)
                    .count();
            System.out.println("字符串" + str + "小写字母个数:" + count);
            System.out.print("小写字母->");
            str.chars().filter(Character::isLowerCase)
                    .forEach(e -> System.out.print((char) e));
            System.out.println("\n" + "*******************************************************");

        }

        /*
         * 在给定的字符串列表中,找出包含最多小写字母的字符串
         * */
        {
            String[] array = {"aA", "BBa", "aa", "aQWE"};

            // f(n) = n + 1;
            Function<Integer, Integer> fn = n -> n + 1;
            // f(1) = 2;
            System.out.println(fn.apply(1));
            // f(2) = 3;
            System.out.println(fn.apply(2));

            String result = Arrays.stream(array)
                    .max(Comparator.comparing(s -> {
                        long count = s.chars().filter(Character::isLowerCase).count();
                        System.out.println(s + ":" + count);
                        return count;
                    }))
                    .orElse("");

            System.out.println(result);
        }

    }

    /**
     * lambda练习
     */
    @Test
    public void testFour() {
        //计算一个字符串中小写字母的个数
        String str = "AbCdEfGhJkL";
        long sum = str.chars().filter(Character::isLowerCase).count();
        System.out.println(sum);
        //在给定的字符串列表中,找出包含最多小写字母的字符串
        String[] array = {"aA", "BBa", "aa"};
        String result = Arrays.stream(array)
                .max(Comparator.comparing(s -> s.chars().filter(Character::isLowerCase).count()))
                .orElse("");
        System.out.println(result);
    }
}
