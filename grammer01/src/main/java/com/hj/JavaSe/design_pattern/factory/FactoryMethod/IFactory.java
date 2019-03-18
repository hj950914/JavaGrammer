package com.hj.JavaSe.design_pattern.factory.FactoryMethod;

/**
 * Author: hj
 * Date: 2019-03-18 18:29
 * Description: <工厂接口>
 */
public interface IFactory {

    //父工厂里面的方法
    Operation createOperation();
}
