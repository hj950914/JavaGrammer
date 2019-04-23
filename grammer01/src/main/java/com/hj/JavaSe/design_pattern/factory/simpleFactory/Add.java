package com.hj.JavaSe.design_pattern.factory.simpleFactory;


/**
 * Author: hj
 * Date: 2019-03-18 16:28
 * Description: <加法类>
 */
public class Add extends Operation {

    @Override
    public double GetResult() {
        return getNumberA() + getNumberB();
    }
}
