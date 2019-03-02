package com.hj.JavaSe.set.hashsetDemoOne;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: hj
 * Date: 2019-03-02 20:05
 * Description: <Cat类的HashSet应用>
 */
public class CatTest {

    @Test
    public void CatHashSet(){
        //定义宠物猫对象
        Cat huahua=new Cat("花花",12,"英国短毛猫");
        Cat fanfan=new Cat("凡凡",3,"中华田园猫");
        //将宠物猫对象放入HashSet中
        Set set=new HashSet();
        set.add(huahua);
        set.add(fanfan);
        //显示宠物猫信息
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println();
        System.out.println("************************************************");

        //再添加一个与花花属性一样的猫
        //重写Cat类中的equals和hashCode方法可以避免添加重复数据
        Cat huahua01=new Cat("花花",12,"英国短毛猫");
        System.out.println("添加重复数据后的宠物猫信息:");
        set.add(huahua01);
        //显示宠物猫信息
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().toString());
        }
    }
}
