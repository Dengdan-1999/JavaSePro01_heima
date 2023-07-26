package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式二：键值对遍历(难度大点)
        Map<String,Integer> map=new HashMap<>();
        map.put("周芷若",94);
        map.put("小昭",95);
        map.put("殷离",92);
        map.put("赵敏",93);
        System.out.println(map);

        //把每个键值对封装成一个对象
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }
}
