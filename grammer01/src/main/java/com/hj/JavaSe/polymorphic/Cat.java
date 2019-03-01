package com.hj.JavaSe.polymorphic;

import java.util.zip.DeflaterOutputStream;

/**
 * Author: hj
 * Date: 2019-01-09 16:39
 * Description: <猫类，继承动物类Animal>
 */
public class Cat extends Animal{

    //体重
    private double weight;

    public Cat(){

    }

    public Cat(String name, int month, double weight) {
        //调用父类的构造方法
        super(name, month);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //跑动
    public void run(){
        System.out.println("小猫快乐的奔跑");
    }

    //玩耍
    public void planBall(){
        System.out.println("小猫喜欢玩线球");
    }

    //重写父类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
