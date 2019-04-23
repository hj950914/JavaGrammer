package com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.impl;

import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;

/**
 * Author: hj
 * Date: 2019-04-22 17:22
 * Description: <乘法类>
 */
public class OperationMultiply extends Operation {

    @Override
    public double GetResult() {
        return getNumberA()*getNumberB();
    }
}
