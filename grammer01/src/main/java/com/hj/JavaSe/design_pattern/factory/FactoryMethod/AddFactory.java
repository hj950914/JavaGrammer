package com.hj.JavaSe.design_pattern.factory.FactoryMethod;

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
