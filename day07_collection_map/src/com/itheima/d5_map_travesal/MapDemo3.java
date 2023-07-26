package com.itheima.d5_map_travesal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式三：Lambda
        Map<String,Integer> map2=new HashMap<>();
        map2.put("周芷若",94);
        map2.put("小昭",95);
        map2.put("殷离",92);
        map2.put("赵敏",93);
        System.out.println(map2);

//        map2.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s+"-->"+integer);
//            }
//        });

        //简化后
        map2.forEach((key,value)->{
            System.out.println(key+"-->"+value);
        });

    }
}
