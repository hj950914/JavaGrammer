package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-11 15:15
 * Description: <上网接口>
 */
public interface INet {

    //常量定义
    int TEMP=20;

    public static final int TEMP2=30;

    //上网方法
    public void network();

   /* //默认方法
    public default void connection(){
        System.out.println("我是接口中的默认方法");
    }

    //静态方法
    public static void stop(){
        System.out.println("我是接口中的静态方法");
    }
*/
}
