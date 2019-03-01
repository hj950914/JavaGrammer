package com.hj.JavaSe.encapsulation;

/**
 * Author: hj
 * Date: 2019-01-04 17:58
 * Description: <专业信息>
 */
public class Subject {

    //专业名称
    private String subName;
    //专业编号
    private String subNumber;
    //专业的学制年限
    private int subYear;
    //专业人数
    private int subPeoples;
    //学生数组
    private Students[] students;

    public Subject(){

    }

    public Subject(String subName, String subNumber, int subYear) {
        this.subName = subName;
        this.subNumber = subNumber;
        this.subYear = subYear;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubNumber() {
        return subNumber;
    }

    public void setSubNumber(String subNumber) {
        this.subNumber = subNumber;
    }

    public int getSubYear() {
        return subYear;
    }

    public void setSubYear(int subYear) {
        this.subYear = subYear;
    }

    public int getSubPeoples() {
        return subPeoples;
    }

    public void setSubPeoples(int subPeoples) {
        this.subPeoples = subPeoples;
    }

    public Students[] getStudents() {
        //设置学生上线200
        if(this.students==null){
            this.students=new Students[200];
        }
        return this.students;
    }

    //将学生加入学生数组
    public void addStudents(Students stu){
        //把学生保存到数组
        for(int i=0;i<this.getStudents().length;i++){
            if (this.getStudents()[i]==null){
                this.getStudents()[i]=stu;
                //专业人数累加
                this.subPeoples=i+1;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "专业信息如下:"+"\n" +
                "专业名称:" + subName + "\n" +
                "专业编号:" + subNumber + "\n" +
                "学制年限:" + subYear +"\n"+
                "专业人数:"+subPeoples;
    }
}
