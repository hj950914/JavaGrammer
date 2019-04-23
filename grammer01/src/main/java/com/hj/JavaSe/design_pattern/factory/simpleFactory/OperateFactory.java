package com.hj.JavaSe.design_pattern.factory.simpleFactory;

/**
 * Author: hj
 * Date: 2019-03-18 16:15
 * Description: <简单工厂>
 */
public class OperateFactory {

    //运算
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            //加法运算,通过向上转型(多态)返回父类引用
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Multiply();
                break;
        }
        return oper;
    }
}