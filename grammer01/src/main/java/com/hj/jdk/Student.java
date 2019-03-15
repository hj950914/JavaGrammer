package com.hj.jdk;

/**
 * Author: hj
 * Date: 2019-03-14 14:43
 * Description: <学生类(测试用)>
 */
public class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        //先比较对象是否相同(如果对象都相同,那么属性肯定也相同了)
        if (this == obj) {
            return true;
        }
        //当对象不相同的时候,就开始比较里面的属性了
        //先判断比较的对象是否属于当前类的对象
        if (obj.getClass() == Student.class) {
            //开始比较属性
            Student student = (Student) obj;
            return student.getName().equals(name) && student.getAge() == age;
        }
        //属性不相同返回false
        return false;
    }

    @Override
    public String toString() {
        return "name:" + this.name + "," + "age:" + age;
    }
}
