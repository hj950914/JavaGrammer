package com.hj.JavaSe.practice;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Author: hj
 * Date: 2019-03-03 20:23
 * Description: <描述>
 */
public class DemoOne {

    @Test
    public void testOne() {
        List<String> list = new ArrayList<>();
        list.add("Black");
        list.add("Red");
        list.add("Yellow");
        //字符串变小写
        List<String> newList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);
        //所有的字符串添加统一前缀 "A-"
        newList = list.stream().map(e -> "A-" + e).collect(Collectors.toList());
        System.out.println(newList);
        //包含字符'e'的字符串
        newList = list.stream().filter(e -> e.contains("e")).collect(Collectors.toList());
        System.out.println(newList);
        //将字符串全部分成单个字符
        newList = list.stream()
                .map(e -> {
                    String[] tokens = e.split("");
                    return new ArrayList<>(asList(tokens));
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(newList);


    }

    @Test
    public void testTwo(){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        //累加
        Integer newList=list.stream().reduce(0,(acc, e)-> acc+e);
        System.out.println(newList);

        //排序
        List<Integer> integers = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(integers);
    }
}
