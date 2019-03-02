package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-09 22:09
 * Description: <第四代手机>
 */
public class ForthPhone extends ThreePhone implements IPhoto,INet{

    @Override
    public void network() {
        System.out.println("手机可以上网");
    }

    //玩游戏
    public void game(){
        System.out.println("手机可以玩游戏");
    }

   /* @Override
    public void connection() {
        System.out.println("ForthPhone的connection");
    }
*/
    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }
}
