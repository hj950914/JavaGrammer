package com.hj.JavaSe.design_pattern.factory.FactoryMethod;

/**
 * Author: hj
 * Date: 2019-03-18 18:38
 * Description: <减法工厂>
 */
public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
