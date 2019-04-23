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
    public void CatHashSet() {
        //定义宠物猫对象
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 3, "中华田园猫");
        //将宠物猫对象放入HashSet中
        Set<Cat> set = new HashSet<>();
        set.add(huahua);
        set.add(fanfan);
        //显示宠物猫信息
        System.out.println("宠物猫信息:");
        Iterator<Cat> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("************************************************");

        //再添加一个与花花属性一样的猫
        //重写Cat类中的equals和hashCode方法可以避免添加重复数据
        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        System.out.println("添加重复数据后的宠物猫信息:");
        set.add(huahua01);
        //显示宠物猫信息
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("************************************************");

        //重新插入一个新宠物猫
        Cat huahua02 = new Cat("花花2代", 2, "英国短毛猫");
        set.add(huahua02);
        System.out.println("添加花花2代后的宠物猫信息:");
        //显示宠物猫信息
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("************************************************");

        //在集合中查找(对象)花花的信息并输出
        System.out.println("通过花花对象查找花花的信息");
        if (set.contains(huahua)) {
            System.out.println("花花找到了！");
            System.out.println(huahua.toString());
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("************************************************");

        //在集合中使用名字查找花花的信息
        System.out.println("通过名字查找花花的信息");
        iterator = set.iterator();
        boolean flag = false;
        Cat c = null;
        while (iterator.hasNext()) {
            c = iterator.next();
            if (c.getName().equals("花花")) {
                flag = true;//找到花花了
                break;
            }
        }
        if (flag) {
            System.out.println("花花找到了");
            System.out.println(c.toString());
        }
        if (!flag) {
            System.out.println("花花没找到");
        }
        System.out.println("************************************************");

        //删除花花二代的信息并重新输出
        for (Cat cat : set) {
            if ("花花2代".equals(cat.getName())) {
                set.remove(cat);
                break;
            }
        }
        //输出set集合
        System.out.println("删除花花2代后");
        for (Cat cat : set) {
            System.out.println(cat.toString());
        }
        System.out.println("************************************************");

        //删除set集合中所有的数据
        if (set.removeAll(set)) {
            System.out.println("删除set集合数据成功");
            for (Cat cat : set) {
                System.out.println(cat.toString());
            }
        }
    }
}
