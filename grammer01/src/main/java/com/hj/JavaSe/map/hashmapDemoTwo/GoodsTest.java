package com.hj.JavaSe.map.hashmapDemoTwo;

import java.util.*;

/**
 * Author: hj
 * Date: 2019-03-13 15:08
 * Description: <商品类测试>
 */
public class GoodsTest {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        //定义HashMap对象
        Map<String, Goods> goodsMap = new HashMap<String, Goods>();
        System.out.println("请输入三条商品信息:");
        int i = 0;
        while (i < 3) {
            System.out.println("请输入第" + (i + 1) + "条商品信息");
            System.out.println("请输入商品编号");
            String goodsId = scanner.next();
            //判断商品编号id是否存在
            if (goodsMap.containsKey(goodsId)) {
                System.out.println("该商品编号已经存在!请重新输入");
                continue;
            }
            System.out.println("请输入商品名称");
            String goodsName = scanner.next();
            System.out.println("请输入商品价格");
            double goodsPrice=0;
            try {
                goodsPrice = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("商品价格格式不正确,请输入数值型数据");
                scanner.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            //将商品信息添加到HashMap中
            goodsMap.put(goodsId, goods);
            i++;
        }
        //遍历Map,输出商品信息
        System.out.println("商品全部信息为:");
        Iterator<Goods> iterator = goodsMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
