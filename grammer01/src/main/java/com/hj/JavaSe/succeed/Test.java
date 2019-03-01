package com.hj.JavaSe.succeed;

/**
 * Author: hj
 * Date: 2019-01-08 15:27
 * Description: <测试类>
 */
public class Test {

    //继承测试方法1
    @org.junit.Test
    public void test1(){
        //设置猫的属性
        Cat cat = new Cat();
        cat.setName("花花");
        cat.setSpecies("中华田园猫🐱");
        cat.eat();
        cat.run();
        System.out.println("=======================");
        //设置狗的属性
        Dog dog = new Dog();
        dog.setName("妞妞");
        dog.setMonth(1);
        dog.eat();
        dog.sleep();
        System.out.println("=======================");
        dog.eat("凡凡");


        /*
        Animal animal = new Dog();
        ((Dog) animal).sleep();
        * */
    }
}
