package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 22:03
 * Description: <原始手机>
 */
public class Telphone {

    //品牌
    private String brand;
    //价格
    private int price;

    public Telphone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //打电话方法
    public void call() {
        System.out.println("手机可以打电话");
    }
}
