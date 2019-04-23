package com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.impl;


import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;

/**
 * Author: hj
 * Date: 2019-03-18 17:02
 * Description: <减法>
 */
public class OperationSub extends Operation {

    @Override
    public double GetResult() {
        return getNumberA()-getNumberB();
    }
}
