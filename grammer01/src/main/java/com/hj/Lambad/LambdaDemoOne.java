package com.hj.Lambad;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-03-15 13:38
 * Description: <Lambda简单语法>
 */
public class LambdaDemoOne {

    @Test
    public void testLambda() {
        //没有使用Lambda表达式
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("没有使用Lambda表达式");
            }
        };
        r1.run();

        //使用Lambda表达式
        Runnable r2 = () -> System.out.println("使用Lambda表达式");
        r2.run();


    }
}
