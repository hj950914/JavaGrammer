package com.hj.JavaSe.succeed;

/**
 * Author: hj
 * Date: 2019-01-08 15:27
 * Description: <动物父类>
 */
public class Animal {

    private String name="妮妮";//名称

    private int month=2;//月份

    private String species="动物";//品种

    public int temp=15;//测试数据

    //定义2个静态成员
    private static int st1=22;
    public static int st2=23;

    //静态代码块
    static {
        System.out.println("我是父类的静态代码块");
    }

    //构造代码块
    {
        System.out.println("我是父类的构造代码块");
    }

    public Animal(){
        System.out.println("我是父类的无参构造方法");
    }



    public Animal(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //动物吃方法
    public  void eat(){
        System.out.println(this.getName()+"在吃东西");
    }

    //带参数的吃东西方法
    public void eat(String name){
        System.out.println(name+"在吃东西");
    }

}
