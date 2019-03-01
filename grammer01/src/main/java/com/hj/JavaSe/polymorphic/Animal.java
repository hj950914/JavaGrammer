package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 16:37
 * Description: <动物父类,抽象类>
 */
public abstract class Animal {
    //昵称
    private String name;
    //年龄
    private int month;

    public Animal(){

    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //吃东西
    public void eat(){
        System.out.println("动物都有吃东西能力");
    }
}
