package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-11 15:18
 * Description: <电脑类>
 */
public class Computer implements INet{

    //上网方法
    @Override
    public void network() {
        System.out.println("电脑可以上网");
    }
}
