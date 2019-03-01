package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 20:57
 * Description: <主人控制动物的类>
 */
public class Master {

    /**
     * 喂宠物
     * 选择喂养哪种宠物
     */

    public void feed(Animal animal){
        /*
        * 判断是谁进行了向上转型
        * */
        if (animal instanceof Cat){
            animal.eat();
            //向下转型
            Cat cat=(Cat) animal;
            cat.planBall();
        }
        if (animal instanceof Dog){
            //向下转型
            Dog dog=(Dog) animal;
            dog.eat();
            dog.sleep();
        }
    }

    /**
     * 养哪种宠物
     * 空闲时间多：养狗狗
     * 空闲时间少:养猫咪
     */

    //参数表示空闲时间
    public Animal raise(boolean isManyTime) {
        if (isManyTime) {
            System.out.println("适合养狗狗");
            return new Dog();
        }
        else {
            System.out.println("适合养猫猫");
            return new Cat();
        }
    }


}
