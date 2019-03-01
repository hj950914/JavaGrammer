package com.hj.JavaSe.polymorphic.people;

import org.junit.Test;

/**
 * Author: hj
 * Date: 2019-01-13 17:47
 * Description: <描述>
 */
public class PersonTwoTest {


    /**
     * @see {根据传入的不同的人的类型,调用对应的read方法}
     */

    //方案1
    /*public void getRead(Man man){
        man.read();
    }
    public void getRead(Woman woman){
        woman.read();
    }
    @Test
    public void testOne(){
        Man man = new Man();
        Woman woman = new Woman();
        this.getRead(man);
        this.getRead(woman);
    }*/


    //方案2
    /*public void getRead(PersonTwo personTwo){
        personTwo.read();
    }
    @Test
    public void testTwo(){
        this.getRead(new Man());
    }*/


    //方案3--使用匿名内部类
    public void getRead(PersonTwo personTwo){
        personTwo.read();
    }
    @Test
    public void testThree(){
        this.getRead(new PersonTwo() {
            @Override
            public void read() {
                System.out.println("男生喜欢看科幻书籍1111");
            }
        });
    }


}

