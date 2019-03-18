package com.hj.JavaSe.design_pattern.factory.simpleFactory;

import java.util.zip.DeflaterOutputStream;

/**
 * Author: hj
 * Date: 2019-03-18 16:22
 * Description: <运算类,2个数字的运算>
 */
public class Operation {

    private double NumberA;
    private double NumberB;

    public Operation(){

    }

    public double getNumberA() {
        return NumberA;
    }

    public void setNumberA(double numberA) {
        NumberA = numberA;
    }

    public double getNumberB() {
        return NumberB;
    }

    public void setNumberB(double numberB) {
        NumberB = numberB;
    }

    //返回计算结果
    public double GetResult() {
        double result = 0;
        return result;
    }
}
