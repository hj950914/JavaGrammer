package com.hj.JavaSe.polymorphic.people;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-01-11 17:14
 * Description: <描述>
 */
public class PeopleTest {

    @Test
    public void test(){
        Person person = new Person();
        person.age=12;

        //获取内部类实例对象方式1
        Person.Heart heart=new Person().new Heart();
        System.out.println(heart.beat());
        //获取内部类实例对象方式2
        Person.Heart heart1=person.new Heart();
        System.out.println(heart1.beat());
        //获取内部类实例对象方式3
        Person.Heart heart2=person.getHeart();
        System.out.println(heart1.beat());

        System.out.println("================");
        //获取静态内部类对象实例
        Person.HeartTwo heartTwo = new Person.HeartTwo();
        System.out.println(heartTwo.beat());
        Person.HeartTwo.say();
        System.out.println("================");
        //获取方法内部类对象实例
        System.out.println(person.getFun());
    }
}
