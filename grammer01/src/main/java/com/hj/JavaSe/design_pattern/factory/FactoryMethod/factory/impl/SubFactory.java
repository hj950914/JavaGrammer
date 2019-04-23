package com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.impl;

import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.impl.OperationSub;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.IFactory;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;

/**
 * Author: hj
 * Date: 2019-03-18 18:38
 * Description: <减法工厂>
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
