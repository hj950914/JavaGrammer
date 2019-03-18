package com.hj.JavaSe.design_pattern.factory.FactoryMethod;


/**
 * Author: hj
 * Date: 2019-03-18 18:40
 * Description: <工厂方法测试>
 */
public class Test {

    /*
    *  定义一个运算父类,旗下有多个运算子类
    *  定义一个父工厂接口,旗下有多个子工厂类,每个工厂类是具体返回指定的运算类实例
    *  当需要增加一个算法时,只需添加一个运算类子类和一个工厂接口的实现类,该实现类返回运算类子类的实例
    * */


    @org.junit.Test
    public void testOne(){
        //实例化加法工厂
        IFactory iFactory=new AddFactory();
        Operation oper=iFactory.createOperation();
        oper.setNumberA(10);
        oper.setNumberB(12);
        System.out.println("加法结果:"+oper.GetResult());

        //实例化减法工厂
        iFactory=new SubFactory();
        oper=iFactory.createOperation();
        oper.setNumberA(100);
        oper.setNumberB(120);
        System.out.println("减法结果:"+oper.GetResult());
    }
}
