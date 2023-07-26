package com.itheima.d5_map_travesal;

import java.util.*;

/*

案例
    Map集合的案例-统计投票人数
需求
    某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D），每个学
    生只能选择一个景点,请统计出最终哪个景点想去的人数最多。
分析
    将80个学生选择的数据拿到程序中去，[A,A,B,A,B,C,D,...]
    准备一个Map集合用于存储统计的结果，Map<String，Integer>;，键是景点，值代表投票数量。
    遍历80个学生选择的景点，每遍历一个景点，就看Map集合中是否存在该景点，不存在存入“景点=1 "，
    存在则其对应值+1，

需要存储——对应的数据时，就可以考虑使用Map集合来做

 */
public class MapExample {
    public static void main(String[] args) {
        //目标：完成该案例
        Map<String, Character> map = new HashMap<>();
        Random r = new Random();
        int guess;
        //首先构建学生=景点键值对数据
        for (int i = 1; i < 81; i++) {
            guess = r.nextInt(81);
            if (guess < 20) {
                map.put("student" + i, 'A');
            } else if (guess < 40) {
                map.put("student" + i, 'B');
            } else if (guess < 60) {
                map.put("student" + i, 'C');
            } else {
                map.put("student" + i, 'D');
            }
        }

        //现在统计每个景点的学生
//        //1.获取景点
//        System.out.println("==========获取景点==========");
//        List<Character> jingdian=new ArrayList<>();
//        map.forEach((k,v)->{
//            jingdian.add(v);
//        });
//        System.out.println("获取到多少条数据："+jingdian.size());

        Map<Character, Integer> maps = new HashMap<>();
        //用第2种方法遍历Map
        Set<Map.Entry<String, Character>> entries1 = map.entrySet();
        Set<Map.Entry<Character, Integer>> entries2 = maps.entrySet();

        System.out.println("====================================");
        System.out.println(map);
        System.out.println(maps);
        System.out.println(entries1);
        System.out.println(entries2);
        System.out.println("==========");

        //外层遍历每个原始数据map
        for (Map.Entry<String, Character> entry1 : entries1) {
            //内层遍历新建的存储景点=人数的map
            Character key = entry1.getValue();
            System.out.println("key=" + key);


            if (maps.containsKey(key)) {
                //如果该景点已经在maps中了，则对应的值加1
                Integer count = maps.get(key);
                count = count + 1;
                maps.put(key, count);
            } else {
                //如果该景点不在maps中，则加入maps
                maps.put(key, 1);
            }
        }
        System.out.println(maps);

        Set<Map.Entry<Character,Integer>> entrys=maps.entrySet();
        int max=0;
        Character c=null;
        for(Map.Entry<Character,Integer> entry:entrys){
            if(max<entry.getValue()){
                max=entry.getValue();
                c=entry.getKey();
            }
        }
        System.out.println("max="+max+", c="+c);

    }
}
