package com.hj.Lambad;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * Author: hj
 * Date: 2019-03-15 15:44
 * Description: <关于方法引用>
 */
public class LambdaDemoTwo {

    /*
     * <静态方法引用>
     * 如果函数式接口的实现恰好是通过调用一个静态方法来实现,那么就可以使用静态方法引用
     * */
    @Test
    public void testOne() {
        //Lambda表达式写法
        Supplier<String> s1 = () -> LambdaDemoTwo.put();
        //静态方法引用写法
        Supplier<String> s2 = LambdaDemoTwo::put;
        System.out.println(s2.get());
    }

    //定义一个静态方法
    public static String put() {
        System.out.println("put method");
        return "hello";
    }

    /*
     * <实例方法引用>
     * 如果函数式接口的实现恰好是通过调用一个实例的实例方法来实现,那么就可以使用静态方法引用
     * */
    @Test
    public void testTwo() {
        //Lambda表达式写法
        Supplier<String> s1 = () -> new LambdaDemoTwo().put1();
        //静态方法引用写法
        Supplier<String> s2 = new LambdaDemoTwo()::put1;
        System.out.println(s2.get());
    }

    //定义一个方法
    public String put1() {
        return "hello";
    }


    /*
     * <对象方法引用>
     *
     * */


    /*
     * <构造方法引用>
     *
     * */

}
