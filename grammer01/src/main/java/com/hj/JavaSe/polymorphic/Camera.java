package com.hj.JavaSe.polymorphic;

/**
 * Author: hj
 * Date: 2019-01-11 15:07
 * Description: <相机类>
 */
public class Camera implements IPhoto {

    //拍照方法
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }
}
