package com.hj.JavaSe.polymorphic.people;

/**
 * Author: hj
 * Date: 2019-01-11 17:13
 * Description: 描述成员,静态,方法内部类
 */
public class Person {
    int age;

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println("人会吃东西");
    }

    //成员内部类
    class Heart {
        int age = 13;
        int temp = 22;

        public String beat() {
            eat();
            return Person.this.age + "心脏在跳动";
        }
    }

    //静态内部类
    public static class HeartTwo {
        public static int age = 13;
        int temp = 22;

        public static void say() {
            System.out.println("hello");
        }

        public String beat() {
            new Person().eat();
            return new Person().age + "心脏在跳动";
        }
    }

    //方法内部类
    public Object getFun() {
        class HeartThree {
            int age = 13;
            int temp = 22;

            public  void  say() {
                System.out.println("hello");
            }

            public String beat() {
                new Person().eat();
                return new Person().age + "心脏在跳动";
            }
        }
        return new HeartThree().beat();
    }
}
