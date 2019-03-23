package com.hj.UtilDemo;

/**
 * Author: hj
 * Date: 2019-03-14 14:43
 * Description: <学生类(测试用)>
 */
public class Student  implements Comparable<Student>{
    private String name;
    private int age;
    private float sorce;//分数

    public Student(String name, int age, float sorce) {
        this.name = name;
        this.age = age;
        this.sorce = sorce;
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

    public float getSorce() {
        return sorce;
    }

    public void setSorce(float sorce) {
        this.sorce = sorce;
    }

    @Override
    public String toString() {
        return "\n"+"Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sorce=" + sorce +
                '}';
    }

    //实现Comparable接口里面的方法
    @Override
    public int compareTo(Student o) {
        //定义一个中间变量判断成绩的大小,如果成绩相等,比较年龄
        int result= (int) (o.getSorce()-this.getSorce());
        //如果成绩相同,比较年龄
        if (result==0){
            result=o.getAge()-this.getAge();
        }
        return result;
    }
}
