package com.hj.UtilDemo;

import org.junit.Test;

import java.awt.event.KeyListener;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: hj
 * Date: 2019-03-22 16:04
 * Description: <集合练习1>
 */
public class DemoOne {
    /*
     * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
     * */
    @Test
    public void testOne() {
        //定义随机数对象
        Random random = new Random();
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            //随机数存入数组
            result[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(result));
        //大于等于10的数字放到一个list集合中
        System.out.print("元素小于10的有:");
        List<Integer> list = Arrays.stream(result).boxed()
                .filter(e -> {
                    //这里使用了过滤器,元素小于10就过滤不用返回,大于等于10的元素return true
                    if (e < 10) {
                        System.out.print(e + " ");
                        return false;
                    } else {
                        return true;
                    }
                })
                .collect(Collectors.toList());
        System.out.println("\n" + "元素大于10的list集合为:" + list);
    }

    /*
     * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
     * (List接口里面有很多和String类相同的方法,比如 indexOf()，lastIndexOf())
     * */
    @Test
    public void testTwo() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(4);
        System.out.println(listTest(al, 2));
    }

    private int listTest(ArrayList<Integer> al, Integer s) {
        System.out.println(al);
        //第一次出现的索引
        int result = al.indexOf(s);
        if (result == -1) {
            return -1;
        } else {
            return result;
        }
    }

    /*
     *已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891",
     * "12347809933"}。将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印来。
     * */
    @Test
    public void testThree() {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        //strs数组存放在LinkedList中
        List<String> strList = new LinkedList<>(Arrays.asList(strs));
        //创建一个Set,把list集合添加进来消除相同元素
        Set<String> strSet = new HashSet<>(strList);
        //使用迭代器打印
        Iterator iterator = strSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //增强for循环打印
        for (String str : strSet) {
            System.out.print(str + " ");
        }
    }

    /*
     * 使用hashSet
     * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号码从1—16中选择；
     * 请随机生成一注双色球号码。（要求同色号码不重复）
     * */
    @Test
    public void testFour() {
        //红球Set集合
        Set<Integer> setRed = new HashSet<>();
        //随机数
        Random random = new Random();
        //定义一个变量用来计算红球的数量,当为6的时候,终止循环
        int flagRed = 0;
        do {
            int result = random.nextInt(33 - 1) + 1;
            //如果没有出现重复元素
            if (!setRed.contains(result)) {
                setRed.add(result);
                flagRed++;
            }
        } while (flagRed < 6);//当集合中已有6和元素时,退出循环
        //生成一个随机篮球
        int GreenBall = random.nextInt(16 - 1) + 1;
        //输出双色球
        System.out.println("双色球开奖结果->>");
        System.out.println("红球:" + setRed);
        System.out.println("篮球:[" + GreenBall + "]");
    }

    /*
     *分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
     *  姓名（String）    年龄（int）    分数（float）
     *  8 liusan          20          90.0F
     *  9 lisi            22           90.0F
     *  10 wangwu         20          99.0F
     *  11 sunliu         22          100.0F
     * */
    @Test
    public void testFive() {
        Student[] obj = {new Student("liusan", 20, 90.0f),
                new Student("lisi", 22, 90.0f),
                new Student("wangwu", 20, 90.0f),
                new Student("sunliu", 20, 100.0f)
        };
        List<Student> stuList = new ArrayList<>(Arrays.asList(obj));
        //降序排序
        Collections.sort(stuList);
        System.out.println(stuList);
        System.out.println("*****************************************************");
        //随机打乱排序
        Collections.shuffle(stuList);
        //利用lambda写法排序,sorted里面就是用的Comparator接口,lambda写法将其省略
        stuList = stuList.stream().sorted((o1, o2) -> {
            //定义一个中间变量判断成绩的大小,如果成绩相等,比较年龄
            int result = (int) (o2.getSorce() - o1.getSorce());
            //如果成绩相同,比较年龄
            if (result == 0) {
                result = o2.getAge() - o1.getAge();
            }
            return result;
        }).collect(Collectors.toList());
        System.out.println(stuList);
    }

    /*
     * 现在有一个map集合如下：
     * Map<Integer,String> map = new HashMap<Integer, String>();
     * map.put(1, "张三丰");
     * map.put(2, "周芷若");
     * map.put(3, "汪峰");
     * map.put(4, "灭绝师太");
     * 要求：
     * 1.遍历集合，并将序号与对应人名打印。
     * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
     * 3.移除该map中的编号为1的信息
     * 4.将map集合中编号为2的姓名信息修改为"周林"
     * */
    @Test
    public void testSix() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        //遍历集合，并将序号与对应人名打印
        System.out.println("遍历集合，并将序号与对应人名打印:");
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("*******************************************");
        //向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5, "李晓红");
        //移除该map中的编号为1的信息
        map.remove(1);
        //将map集合中编号为2的姓名信息修改为"周林"
        map.put(2, "周林");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /*
     * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
     * 将第一个数组元素作key,第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
     * */
    @Test
    public void testSeven() {
        String[] strOne = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] strTwo = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        Map<String, String> mapStr = new HashMap<>();
        //方式1:使用循环加入
        for (int i = 0; i < strOne.length; i++) {
            mapStr.put(strOne[i], strTwo[i]);
        }
        System.out.println(mapStr);
    }

    /*
     * 定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
     * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
     * */
    @Test
    public void testEight() {
        String[] str = {"abc", "bcd"};
        List<String> list = Arrays.asList(str);
        //将集合中字符串装换成字符数组
        char[] chars = (list.get(0) + list.get(1)).toCharArray();
        //将字符数组转换成list
        List<Character> list1 = new ArrayList<>();
        for (char c : chars) {
            list1.add(c);
        }
        System.out.println(list1);
        //HashMap具有筛选功能,当添加相同的key时,可以自动合并"map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1)"
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            //自动合并相同的key
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            System.out.println(map);
        }
        System.out.println("最终结果:"+map);
    }

    /*
    *
    * */

}
