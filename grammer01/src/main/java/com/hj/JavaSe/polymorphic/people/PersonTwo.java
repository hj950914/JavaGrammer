package com.hj.JavaSe.polymorphic.people;

import javax.print.DocFlavor;
import java.util.zip.DeflaterOutputStream;

/**
 * Author: hj
 * Date: 2019-01-13 17:41
 * Description: 抽象父类
 */
public abstract class PersonTwo {

    private String name;

    public PersonTwo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}
