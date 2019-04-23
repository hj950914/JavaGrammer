package com.hj.jdk;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author: hj
 * Date: 2019-03-13 17:33
 * Description: <String类的一些常用方法>
 */
public class StringTest {

    //String类的一些常用方法
    @Test
    public void testStringMethods() {
        /*
        trim()方法：去除字符串2端空格
        * */
        String s = "      trim ";
        System.out.println("没有使用trim()方法去除字符串俩端空格:" + s);
        System.out.println("使用trim()方法去除字符串俩端空格:" + s.trim());
        System.out.print("******************************************************");
        System.out.println();

        /*
        split()方法:字符串分割
         * */
        String s1 = "abcabcabc";
        //数组转换成list列表
        List<String> list = Arrays.asList(s1.split(""));
        System.out.println(list);
        System.out.print("******************************************************");
        System.out.println();

        /*
         *toCharArray()方法:将字符串转换成字符数组
         * */
        String s2 = "defdefdef";
        char[] chars = s2.toCharArray();
        System.out.println(chars);
        System.out.print("******************************************************");
        System.out.println();

        /*
         *indexOf()方法：返回指定字符串或者字符第一次出现的位置
         * */
        String s3 = "abcdefg";
        System.out.println(s3.indexOf("bc"));
        System.out.print("******************************************************");
        System.out.println();

        /*
         *lastIndexOf()方法:和IndexOf方法相反,返回指定字符最后一次出现的位置
         * */
        String s5 = "abcdebfg";
        System.out.println(s5.lastIndexOf("b"));
        System.out.print("******************************************************");
        System.out.println();

        /*
         * charAt()方法:返回指定索引处的字符值
         * */
        String s4 = "abcdefg";
        System.out.println(s4.charAt(2));
        System.out.print("******************************************************");
        System.out.println();

    }

    //StringBuilder类的常用方法
    @Test
    public void testStringBuilder() {
        /*
         * append拼接方法
         * */
        StringBuilder stringBuilder = new StringBuilder("huangjie");
        stringBuilder.append("19950914");
        System.out.println(stringBuilder);
        System.out.print("循环拼接:");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
