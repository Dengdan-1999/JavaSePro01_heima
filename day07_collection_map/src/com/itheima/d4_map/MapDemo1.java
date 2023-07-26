package com.itheima.d4_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：掌握Map集合的特点
        //Map体系整体特点：HashMap:按照键、无序、无索引，值不做要求，键和值都可以是null
        Map<String,Integer> map=new HashMap<>(); //一行经典代码
        map.put("吉他",2);
        map.put("钢琴",3);
        map.put("书法",2);
        map.put("画画",2);
        map.put("唱歌",2);
        map.put("跳舞",2);
        map.put(null,null);
        System.out.println(map);
    }
}
