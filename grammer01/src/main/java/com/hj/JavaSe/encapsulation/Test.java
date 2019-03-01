package com.hj.JavaSe.encapsulation;

/**
 * Author: hj
 * Date: 2019-01-04 18:11
 * Description: <测试>
 */
public class Test {

    @org.junit.Test
    public void test01(){
        //设置专业信息
        Subject subject = new Subject("计算机科学与应用","J0001",4);
        //分别创建三名学生信息
        Students students1 = new Students("张三","S01",'男',18,subject);
        Students students2 = new Students("李四","S02",'女',17,subject);
        Students students3 = new Students("王五","S03",'男',18,subject);
        //将三名学生的实例对象存入数组
        subject.addStudents(students1);
        subject.addStudents(students2);
        subject.addStudents(students3);
        //输出专业信息
        System.out.println(subject.toString());
        System.out.println("=====================================");
        //输出学生信息
        for (int i=0;i<subject.getSubPeoples();i++){
            System.out.println(subject.getStudents()[i].toString());
            System.out.println("=====================================");
        }
    }
}
