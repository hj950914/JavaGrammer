package com.hj.JavaSe.polymorphic.people;

/**
 * Author: hj
 * Date: 2019-01-13 17:44
 * Description: <继承抽象父类>
 */
public class Man extends PersonTwo {
    @Override
    public void read() {
        System.out.println("男生喜欢看科幻书籍");
    }
}
