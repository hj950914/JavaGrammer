package com.hj.JavaSe.design_pattern.factory.simpleFactory;

/**
 * Author: hj
 * Date: 2019-04-22 17:07
 * Description: <乘法>
 */
public class Multiply extends Operation {

    @Override
    public double GetResult() {
        return getNumberA()*getNumberB();
    }
}
