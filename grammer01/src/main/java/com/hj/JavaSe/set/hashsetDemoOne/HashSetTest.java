package com.hj.JavaSe.set.hashsetDemoOne;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: hj
 * Date: 2019-03-02 19:16
 * Description: <Set集合使用.无序且不能有重复元素>
 */
public class HashSetTest {

    @Test
    public void testOne() {
        //将英文单词添加到HashSet中
        Set set=new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        //显示集合内容
        System.out.println("集合中元素为:");
        //使用迭代器
        Iterator iterator = set.iterator();
        //遍历迭代器并输出元素
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("**************************************");

        //在集合中插入一个新元素
        //set.add("green");
        set.add("white");
        System.out.println("插入重复元素后输出的结果:");
        //使用迭代器
        Iterator iterator1 = set.iterator();
        //遍历迭代器并输出元素
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println("**************************************");

        //
    }

}
