package com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.impl;

import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.impl.OpearationAdd;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory.IFactory;
import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;

/**
 * Author: hj
 * Date: 2019-03-18 18:32
 * Description: <加法工厂>
 */
public class AddFactory implements IFactory {


    @Override
    public Operation createOperation() {
        return new OpearationAdd();
    }
}
