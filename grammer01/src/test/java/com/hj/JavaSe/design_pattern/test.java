package com.hj.JavaSe.design_pattern;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-01-09 15:55
 * Description: <单例模式测试类>
 */
public class test {

    @Test
    public void test() {
        //获取单例
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        //单例模式创建同一个实例
        System.out.println(singleton.equals(singleton1));
    }
}
