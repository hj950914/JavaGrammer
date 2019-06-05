package com.hj.JavaSe.exception;

import org.junit.Test;

import java.security.spec.ECField;
import java.util.InputMismatchException;

/**
 * Author: hj
 * Date: 2019-02-26 18:03
 * Description: <异常处理实例>
 */
public class ExceptionDemo {

//    定义2个整数,输出2数之商

    @Test
    public void test1() {
        /*
         * 多重catch时,根类Exception要写在最后
         *
         * */
        try {
            System.out.println(1/0);
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            System.out.println("我最终做会被执行");
        }
    }

    /*
     * throws关键字
     * */
    public void test2() throws ArithmeticException {
        System.out.println(1/0);
    }

    @Test
    public void test3() {
        try {
            test2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    //描述酒店入住规则,18以下,80以上不能入住
    @Test
    public void test4() {
        int age = 0;
        try {
            if (age < 18 || age > 80) {
                throw new Exception("18以下,80以上不能入住");
            } else {
                System.out.println("可以入住");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
