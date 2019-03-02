package com.hj.JavaSe.polymorphic;

import javax.swing.*;

/**
 * Author: hj
 * Date: 2019-01-11 15:30
 * Description: <智能手表类>
 */
public class SmartWatch implements INet,IPhoto {

    //上网
    @Override
    public void network() {
        System.out.println("智能手表可以上网");
    }

    /*@Override
    public void connection() {
        System.out.println("SmartWatch中的connection");
    }*/

    @Override
    public void photo() {

    }
}
