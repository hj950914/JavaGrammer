package com.hj.JavaSe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: hj
 * Date: 2019-07-08 23:01
 * Description: <描述>
 */
public class ArrayListInitTest {

    /**
     * arraylist初始化容量
     */
    @Test
    public void test1(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);//9
        list.add(2);//10
        list.add(2);
        list.add(2);

    }
}
