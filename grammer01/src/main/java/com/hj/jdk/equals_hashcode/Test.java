package com.hj.jdk.equals_hashcode;

/**
 * Author: hj
 * Date: 2019-06-24 15:23
 * Description: <描述>
 */
public class Test {

    @org.junit.Test
    public void test(){
        CaseInsensitiveString caseInsensitiveString=new CaseInsensitiveString("HJ");
        CaseInsensitiveString caseInsensitiveString2=new CaseInsensitiveString("hj");
        System.out.println(caseInsensitiveString.equals("hj"));//true
        //下面的equals方法根本执行不到CaseInsensitiveString类里面重写的equals方法,而是执行String类里面的equals方法
        System.out.println("hj".equals(caseInsensitiveString));//false
    }
}
