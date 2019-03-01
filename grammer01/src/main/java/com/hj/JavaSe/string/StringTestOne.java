package com.hj.JavaSe.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Author: hj
 * Date: 2019-02-27 21:01
 * Description: <关于String类的使用，当频繁操作字符串的时候推荐使用StringBuilder>
 */
public class StringTestOne {

    //取字符串内容
    @Test
    public void testOne() {
        //定义一个字符串
        String str = "JAVA 编程基础";
        //打印输出字符串的长度
        System.out.println(str.length());
        System.out.println("**********************************");

        //打印str中的"程"内容。6表示下标
        System.out.println(str.charAt(6));
        System.out.println("**********************************");

        //打印str中子串内容"编程基础"，5表示取出下标5及其之后的所有字符
        System.out.println(str.substring(5));
        System.out.println("**********************************");

        //打印str中子串内容"编程"
        System.out.println(str.substring(5, 7));
    }

    //查找字符或者子串出现的位置
    @Test
    public void testTwo() {
        //定义一个字符串"JAVA编程基础,我喜欢java编程"
        String str = new String("JAVA编程基础,我喜欢java编程");
        //查找字符'A'在字符串中第一次出现的位置
        System.out.println(str.indexOf('A'));
        System.out.println("*******************************************");

        //查找子串"编程"在字符串中第一次出现的位置
        System.out.println(str.indexOf("编程"));
        System.out.println("*******************************************");

        //查找字符'A'在字符串中最后一次出现的位置
        System.out.println(str.lastIndexOf('A'));
        System.out.println("*******************************************");

        //查找子串"编程"在字符串中最后一次出现的位置
        System.out.println(str.lastIndexOf("编程"));
        System.out.println("*******************************************");

        //从字符串str的下标为8开始查找,查找子串"编程"第一次出现的位置
        System.out.println(str.indexOf("编程",8));
    }

    //字符串和byte数组之间的互相转换
    @Test
    public void testThree()throws UnsupportedEncodingException {
        //定义一个字符串
        String str = new String("JAVA 编程 基础");
        //将字符串转换为byte字节数组,指定编码格式,并打印输出
        byte[] bytes = str.getBytes("UTF-8");
        for (byte i:bytes) {
            System.out.print(i+" ");
        }
        System.out.println("*********************************");

        //将byte字节数组转换为字符串,指定编码格式,使用String类里的一个构造方法即可。
        String str1 = new String(bytes,"UTF-8");
        System.out.println(str1);
    }

    //==和equals方法的区别
    @Test
    public void testFour(){
        //定义三个字符串
        String str1="imooc";
        String str2="imooc";
        String str3 = new String("imooc");
        //equals比较的是内容,==比较的是引用
        //引用放在栈中,对象放在堆中,常量池存放内容
        System.out.println("str1和str2内容相同吗？"+str1.equals(str2));//true
        System.out.println("str1和str3内容相同吗？"+str1.equals(str3));//true
        System.out.println("str1和str2地址相同吗？"+(str1==str2));//true
        System.out.println("str1和str3地址相同吗？"+(str1==str3));//false

    }

    //关于String的不可变性
    @Test
    public void testFive(){
        //String对象一旦被创建,则不能修改,是不可变的
        //所谓的修改其实是创建了新的对象,所指向的内存空间不变
        String s1 = "imooc";
        s1= "hello,"+s1;
        //s1不再指向imooc所在的内存空间,而是指向了"hello,imooc"
        System.out.println("s1="+s1);
        System.out.println("************************************");

        String s3=new String("hello,imooc!");
        System.out.println("子串:"+s3.substring(0,5));
        System.out.println("s3="+s3);//s3=hello,imooc!内容不变
    }

    //字符串StringBuilder（线程不安全）
    @Test
    public void testSix(){
        /*
        * 和String的区别在于,StringBuilder是可变性的,当改变里面的内容时,
        * 直接在存储的堆里面的new StringBuilder()里面修改或者追加内容,而String则是
        * 重新在堆里添加新的对象.
        * */
        //定义一个字符串
        StringBuilder str=new StringBuilder("你好");
        //在"你好"后面添加内容
        str.append(',');
        str.append("imooc!");
        System.out.println("str="+str);
        //方法2
        //System.out.println("str="+str.append(',').append("imooc!"));
        System.out.println("*********************************************");

        //将字符串str变成"你好,IMOOC!"
        //方式1,先删除小写,再重新插入大写
        //System.out.println("替换后="+str.delete(3,str.length()).insert(str.length(),"IMOOC!"));
        //方式2,使用replace方法直接替换
        System.out.println("替换后:"+str.replace(3,str.length(),"IMOOC!"));
        System.out.println("*********************************************");

        //在字符串"你好,imooc"中取出"你好"并输出
        System.out.println(str.substring(0,2));

    }
}
