package com.hj.UtilDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Author: hj
 * Date: 2019-03-14 19:17
 * Description: <List案例1(List里面有大多数String类里的方法)>
 */
public class ListDemoOne {
    /*
     * 已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。
     * 采用List集合和随机数。
     * (2008 北京奥运会男足参赛国家:科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、
     * 日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利)
     * */

    @Test
    void testList() {
        String[] countrys = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚",
                "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"};
        //定义一个List集合,添加足球参赛国家(将数组转换成list集合)
        List<String> list = new ArrayList<>(Arrays.asList(countrys));
        //随机分配函数
        Random random = new Random();
        //分配4组
        for (int i = 1; i <= 4; i++) {
            System.out.print("第" + i + "组为:");
            for (int j = 1; j <= 4; j++) {
                String str = list.get(random.nextInt(list.size()));
                System.out.print(str + " ");
                //每分配一个值就从集合中删除这个值
                list.remove(str);
            }
            System.out.println();
        }
    }
}
