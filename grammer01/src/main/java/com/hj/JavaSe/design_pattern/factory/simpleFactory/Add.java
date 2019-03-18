package com.hj.JavaSe.design_pattern.factory.simpleFactory;

import java.sql.ResultSet;

/**
 * Author: hj
 * Date: 2019-03-18 16:28
 * Description: <加法类>
 */
public class Add extends Operation {

    @Override
    public double GetResult() {
        double result = getNumberA() + getNumberB();
        return result;
    }
}
