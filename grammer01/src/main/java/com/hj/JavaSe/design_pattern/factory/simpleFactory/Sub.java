package com.hj.JavaSe.design_pattern.factory.simpleFactory;

import java.sql.ResultSet;

/**
 * Author: hj
 * Date: 2019-03-18 17:02
 * Description: <减法>
 */
public class Sub extends Operation {

    @Override
    public double GetResult() {
        return getNumberA()-getNumberB();
    }
}
