package com.hj.JavaSe.wrap;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-02-27 17:19
 * Description: <包装类学习>
 */
public class WrapTestOne {

    //Integer包装类测试
    @Test
    public void testOne() {
        //装箱:把基本数据类型转换成包装类
        //1：自动装箱
        int t1 = 2;
        Integer t2 = t1;
        //2：手动装箱
        Integer t3 = new Integer(t1);
        //测试
        System.out.println("t1的值：" + t1);
        System.out.println("Integer类型对象t2的值：" + t2);
        System.out.println("Integer类型对象t3的值：" + t3);
        System.out.println("*************************************");

        //拆箱:把包装类型转换成基本数据类型
        //1：自动装箱
        int t4 = t2;
        //2：手动装箱
        int t5 = t2.intValue();
        //测试
        System.out.println("Integer类型对象t2=" + t2);
        System.out.println("自动拆箱后,int类型的对象t4=" + t4);
        System.out.println("手动拆箱后,int类型的对象t5=" + t5);
    }

    //基本数据类型和字符串互相转换
    @Test
    public void testTwo() {
        //基本数据类型转换为字符串
        int t1 = 2;
        String s = Integer.toString(t1);
        String s1 = t1 + "";
        //测试
        System.out.println("int类型转换为String类型之后s=" + s);
        System.out.println("通过简单方法将int类型转换成String类型s1=" + s1);
        System.out.println("**************************************");

        //字符串转换成基本数据类型
        int t3 = Integer.parseInt(s);//方法1
        int t4 = Integer.valueOf(s);//方法2
        //测试
        System.out.println("String类型转换为int类型t3=" + t3);
        System.out.println("String类型转换为int类型t4=" + t4);
    }

    //容易出错的地方
    @Test
    public void testthree() {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        //比较的2个不同的引用,所以不相等
        System.out.println("one==two的结果:" + (one == two));//结果false
        System.out.println("***********************************************");

        Integer three = 100;
        //比较的是内容,所以相等
        System.out.println("three==100的结果:" + (three == 100));//结果true
        System.out.println("***********************************************");

        Integer four = 100;
        System.out.println("three==four的结果:" + (three == four));//结果true
        System.out.println("***********************************************");

        Integer five = 200;
        System.out.println("five=200的结果:" + (five == 200));//结果true
        System.out.println("***********************************************");

        Integer six = 200;
        //这里是false,因为java是定义在 -128<参数<128
        //Integer six=200和Integer five=200的值不在参数范围内,所以不相等
        System.out.println("five==six的结果：" + (five == six));//结果false
        System.out.println("***********************************************");

        Double d1 = Double.valueOf(100);
        System.out.println("d1==100的结果:" + (d1 == 100));//结果true
        System.out.println("***********************************************");

        Double d2 = Double.valueOf(100);
        //Double和Float类型是不具备对象常量池的,也就是没有-128<参数<128规定,所以结果不相等
        System.out.println("d1==d2的结果:" + (d1 == d2));//结果false
    }

}
