package com.hj.UtilDemo;

import java.util.*;

/**
 * Author: hj
 * Date: 2019-03-14 17:13
 * Description: <Map案例1>
 */
public class MapDemoOne {

    /* 1:(通过key值找value值)
     * 从命令行读入一个字符串,表示一个年份,输出该年的世界杯冠军是哪支球队。
     * 如果该年没有举办世界杯，则输出:没有举办世界杯。
     * */

    /* 2:(通过value值找对应的key值,多个value可以对应同一个key)
     * 在原有世界杯Map的基础上,增加如下功能:读入一支球队的名字,输出该球队
     * 夺冠的年份列表.例如,读入“巴西”,应当输出 1958 1962 1970 1994 2002
     * 读入“荷兰”,应当输出没有获得过世界杯
     *
     * */

    public static void main(String srgs[]) {
        System.out.print("请输入举办年份:");
        //键盘读取
        String year = new Scanner(System.in).next();
        //定义map
        Map<String, String> map = new HashMap<>();
        //存入数据(大概)
        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "西德");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1970", "巴西");
        map.put("1974", "西德");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "西德");
        if (map.containsKey(year)) {
            System.out.println(year + "年的世界杯冠军是" + "<" + map.get(year) + ">" + "球队");
        } else {
            System.out.println(year + "年没有举办世界杯");
        }
        System.out.println("*****************************************************************************");
        System.out.print("请输入球队名字:");
        String footballName = new Scanner(System.in).next();
        //如果找不到冠军
        if (!map.containsValue(footballName)) {
            System.out.println(footballName + "没有获得过冠军");
        } else {
            System.out.print("获得冠军的年份:");
            for (String s : map.keySet()) {
                if (map.get(s).equals(footballName)){
                    System.out.print(s+" ");
                }
            }
        }
    }
}
