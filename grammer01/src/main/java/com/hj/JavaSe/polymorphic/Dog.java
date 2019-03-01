package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 16:45
 * Description: <狗类,继承父类Animal>
 */
public class Dog extends Animal{

    //性别
    private String sex;

    public Dog(){

    }

    public Dog(String name, int month, String sex) {
        //调用父类构造器
        super(name, month);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //睡觉
    public void sleep(){
        System.out.println("小狗要午睡");
    }

    //重写父类方法
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
