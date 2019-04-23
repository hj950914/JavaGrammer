package com.hj.JavaSe.design_pattern.factory.simpleFactory;

/**
 * Author: hj
 * Date: 2019-03-18 16:40
 * Description: <简单工厂测试>
 */
public class Test {

    @org.junit.Test
    public void testOne(){
        //由工厂类选择实例化哪个类
        Operation operation=OperateFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(1);
        System.out.println("加法结果:"+operation.GetResult());
        operation=OperateFactory.createOperate("-");
        operation.setNumberA(10);
        operation.setNumberB(7);
        System.out.println("减法结果:"+operation.GetResult());
        operation = OperateFactory.createOperate("*");
        operation.setNumberA(10);
        operation.setNumberB(10);
        System.out.println("乘法结果:"+operation.GetResult());
    }

}
