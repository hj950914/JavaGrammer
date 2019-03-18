package com.hj.JavaSe.design_pattern.factory.FactoryMethod;


/**
 * Author: hj
 * Date: 2019-03-18 16:28
 * Description: <加法类>
 */
public class OpearationAdd extends Operation {

    @Override
    public double GetResult() {
        double result = getNumberA() + getNumberB();
        return result;
    }
}
