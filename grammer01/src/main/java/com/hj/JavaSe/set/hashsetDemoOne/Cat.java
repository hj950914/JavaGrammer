package com.hj.JavaSe.set.hashsetDemoOne;

import java.util.Objects;

/**
 * Author: hj
 * Date: 2019-03-02 20:03
 * Description: <宠物猫类>
 */
public class Cat {

    private String name;//名字
    private int month;//年龄
    private String species;//品种

    public Cat(String name, int month, String species) {
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //判断对象是否相等,相等则返回true,不用继续比较属性了
        if (this==obj){
            return true;
        }
        //判断obj是否是Cat类的对象
        if (obj.getClass()==Cat.class){
            Cat cat=(Cat) obj;
            return cat.getName().equals(name)&&cat.getMonth()==month
                    &&cat.getSpecies().equals(species);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}
