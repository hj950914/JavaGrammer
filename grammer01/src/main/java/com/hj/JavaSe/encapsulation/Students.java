package com.hj.JavaSe.encapsulation;

import javax.swing.*;

/**
 * Author: hj
 * Date: 2019-01-04 17:58
 * Description: <学生信息>
 */
public class Students {

    //姓名
    private String sName;
    //学号
    private String sId;
    //性别
    private char sex;
    //年龄
    private int sAge;
    //专业信息
    private Subject subject;

    public Students(){}

    public Students(String sName, String sId, char sex, int sAge, Subject subject) {
        this.sName = sName;
        this.sId = sId;
        this.sex = sex;
        this.sAge = sAge;
        this.subject = subject;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "学生信息如下:" +"\n"+
                "姓名:" + sName + "\n" +
                "学号:" + sId + "\n" +
                "性别:" + sex + "\n" +
                "年龄:" + sAge + "\n" +
                "所报专业名称:" + subject.getSubName()+ "\n" +
                "学制年限:" + subject.getSubYear();
    }
}
