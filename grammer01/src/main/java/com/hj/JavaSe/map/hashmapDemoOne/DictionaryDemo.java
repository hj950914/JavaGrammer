package com.hj.JavaSe.map.hashmapDemoOne;


import java.util.*;

/**
 * Author: hj
 * Date: 2019-03-03 17:32
 * Description: <Map集合的案例>
 */
public class DictionaryDemo {


    public static void main(String[] args) {
        //定义map集合
        Map<String, String> stringMap = new HashMap<>();
        System.out.println("请输入三组单词和对应的注释,并存放到HashMap中");
        Scanner scanner = new Scanner(System.in);
        //添加数据
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值(单词):");
            String key = scanner.next();
            System.out.println("请输入value值(注释):");
            String value = scanner.next();
            //添加数据
            stringMap.put(key, value);
            i++;
        }
        System.out.println("使用迭代器输出所有的value");
        Iterator<String> iterator = stringMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();
        System.out.println("*************************************************");

        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key - value:");
        Set<Map.Entry<String, String>> entrySet = stringMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("*************************************************");

        //通过单词找到注释并输出
        //使用keySet方法
        System.out.println("请输入要查找的单词:");
        String next = scanner.next();
        //1:取得keySet
        Set<String> keySet = stringMap.keySet();
        //2:遍历keySet
        boolean flag = false;
        for (String key : keySet) {
            if (next.equals(key)) {
                System.out.println("找到了！" + "键值对为：" + key + "-" + stringMap.get(key));
                flag = true;//找到了
                break;
            }
        }
        //如果没有找到
        if (flag == false) {
            System.out.println("没有找到！");
        }
    }

}
