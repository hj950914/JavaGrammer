package com.hj.JavaSe.succeed;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-01-08 17:24
 * Description: <测试类>
 */
public class TestThree {

    //测试类1
    @Test
    public void test1(){
        Animal animalOne = new Animal();
        Animal animalTwo = new Animal();
        boolean flag=animalOne.equals(animalTwo);
        System.out.println(flag);
        System.out.println("=====================");
        String s1=new String("hello");
        String s = new String("hello");
        System.out.println(s.equals(s1));
    }
}

