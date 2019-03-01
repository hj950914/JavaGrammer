package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 16:50
 * Description: <多态测试类>
 */
public class Test {

    @org.junit.Test
    public void test1() {
        //Animal animal = new Animal();
        //向上转型
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        //animal.eat();
        animal1.eat();
        animal2.eat();
        System.out.println("======================");
        //向下转型
        if (animal1 instanceof Cat){
            Cat cat=(Cat)animal1;
            cat.eat();
            cat.run();
            System.out.println("======================");
        }
    }

    //测试方法
    @org.junit.Test
    public void test2(){
        Master master = new Master();
        master.feed(new Dog());
        System.out.println("================");
        //时间充足
        Animal animal=master.raise(false);
        System.out.println(animal);
    }
}
