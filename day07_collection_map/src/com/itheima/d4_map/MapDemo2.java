package com.itheima.d4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("邓丹",500000);
        map.put("王正飞",150000);
        map.put("张武君",350000);
        map.put("谢恩博",450000);
        map.put("吴其欣",800000);
        map.put("李昌远",650000);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        int i=map.get("邓丹");
        System.out.println(i);

        map.remove("张武君");
        System.out.println(map);

//        map.clear();
        System.out.println(map.isEmpty());

        System.out.println(map.containsKey("谢恩博"));

        System.out.println(map.containsValue(1000000));

        Set<String> set=map.keySet();
        Collection<Integer> values=map.values();

        System.out.println("set:"+set);
        System.out.println("values:"+values);


    }
}
