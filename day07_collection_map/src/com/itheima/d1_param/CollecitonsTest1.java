package com.itheima.d1_param;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//Collections是一个用来惭怍集合的工具类
public class CollecitonsTest1 {
    public static void main(String[] args) {
        //目标：掌握Collections提供的常用静态方法
        ArrayList<String> list=new ArrayList<>();

        //给集合批量添加元素
        Collections.addAll(list,"赵敏","康敏","周芷若","小昭","殷离","王语嫣");
        System.out.println(list);

        //打乱集合中的元素顺序，这个只能用于list类集合
        Collections.shuffle(list);
        System.out.println(list);

        //对list集合中的元素进行升序排列
        Collections.sort(list);
        System.out.println(list);

        //对list集合中的元素，按照比较器对象指定的规则进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        //简化版本
        Collections.sort(list,(o1,o2)->{
            return 0;
        }
        );
    }
}
