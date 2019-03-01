package com.hj.JavaSe.succeed;

/**
 * Author: hj
 * Date: 2019-01-08 15:36
 * Description: <猫类,继承Animal父类>
 */
public class Dog extends Animal{

    private String sex;//性别

    public Dog(){}

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //狗的sleep方法
    public void sleep(){
        super.eat();
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大");
    }

    //重写父类的方法
    public void eat(){
        System.out.println(this.getName()+"最近没有食欲");
    }

    //重写父类的方法
    @Override
    public void eat(String name1) {
        System.out.println(name1+"最近没有食欲");
    }
}
