package com.hj.jdk;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-03-14 00:54
 * Description: <关于Object类和System类的常用方法测试>
 */

public class ObjectAndSystem {

    /*
     * Object类的一些常用方法:equals(),hashCode(),toString(),clone()
     * */
    //equals()：如果没有对equals方法进行重写,则比较的是对象的地址。可以重写使其比较对象的内容。
    @Test
    public void testEquals() {
        String s1 = "hj";
        String s2 = "hj";
        System.out.println(s1.equals(s2));//true
        String s3 = new String("hj");
        String s4 = new String("hj");
        System.out.println(s3.equals(s4));//true
        System.out.println(s3 == s4);//false
        System.out.println("******************************");

        Student student1 = new Student("hj", 23);
        Student student2 = new Student("hj", 23);
        //由于在Student类中重写了equals()方法,所有比较的是对象内容.
        System.out.println(student1.equals(student2));//true
    }

    //hashCode():对象的哈希值
    @Test
    public void testHashcode() {

    }

    //toString():如果没有重写toString方法,就是返回对象的字符串表示(包.类@内存地址)
    @Test
    public void testTostring() {
        Student student = new Student("hj", 23);
        System.out.println(student.toString());
    }

    //clone():对象复制
    @Test
    public void testClone() {

    }


    /*
     * System类的一些常用方法:数组复制(案例在同包的ArrayTest类里),out,err.
     * */
    @Test
    public void testErr() {

    }


}

