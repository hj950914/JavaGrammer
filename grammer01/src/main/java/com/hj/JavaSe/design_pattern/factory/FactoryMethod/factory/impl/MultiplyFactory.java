package com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.impl;

import com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.IFactory;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.impl.OperationMultiply;

/**
 * Author: hj
 * Date: 2019-04-22 17:26
 * Description: <乘法工厂>
 */
public class MultiplyFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMultiply();
    }
}
