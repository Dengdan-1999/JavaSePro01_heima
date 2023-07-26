package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式一：键找值
        Map<String,Integer> map=new HashMap<>();//一行经典代码
        map.put("iphone",6);
        map.put("huawei",8);
        map.put("xiaomi",5);
        map.put("oppo",4);
        System.out.println(map);

        //1.先获取Map集合的全部键值到一个Set集合中去
        Set<String> keys=map.keySet();

        //2.遍历键找值
        for(String key:keys){
            Integer value=map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
