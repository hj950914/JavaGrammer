package com.hj.JavaSe.design_pattern;

import javax.swing.*;

/**
 * Author: hj
 * Date: 2019-01-09 15:42
 * Description: <单例模式>
 */
public class Singleton {

    //1：创建类中私有构造
    private Singleton(){

    }

    /**
     *单例模式的之饿汉式,不用的时候就已经创建实例
     */
    /*//2:创建该类型的私有静态实例
    private static  Singleton singleton=new Singleton();

    //3:创建共有静态方法返回静态实例对象
    public static Singleton getInstance(){
        return singleton;
    }*/


    /**
     *单例模式的之懒汉式,用的时候才创建实例
     */
    //2:创建该类型的私有静态实例
    private static Singleton singleton=null;

    //3:创建共有静态方法返回静态实例对象
    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

}
