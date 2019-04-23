package com.hj.JavaSe.design_pattern.factory.FactoryMethod.factory;

import com.hj.JavaSe.design_pattern.factory.FactoryMethod.operation.Operation;

/**
 * Author: hj
 * Date: 2019-03-18 18:29
 * Description: <工厂接口>
 */
public interface IFactory {

    //父工厂里面的方法
    Operation createOperation();
}
