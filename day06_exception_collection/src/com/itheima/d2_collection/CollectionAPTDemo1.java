package com.itheima.d2_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionAPTDemo1 {
    public static void main(String[] args) {
        //目标：掌握Collection提供的常用方法：是所有单列集合都可以直接用的
        Collection<String> list=new ArrayList<>();

        //1.添加数据boolean add(E e)
        list.add("张无忌");
        list.add("殷离");
        list.add("周芷若");
        list.add("小昭");
        list.add("赵敏");
        System.out.println(list);

        //2.清空集合
//        list.clear();
//        System.out.println(list);

        //3.判断集合是否为空
        System.out.println(list.isEmpty());

        //4.直接删除集合中的某个数据：默认只能删除第一个
        System.out.println(list.remove("张无忌"));
        System.out.println(list);

        //5.判断集合中是否包含某个数据
        System.out.println(list.contains("赵敏小bitch"));
        System.out.println(list.contains("周芷若小贱货"));

        //6.获取集合的大小
        System.out.println(list.size());

        //7.把集合转换成数组
        Object[] arr=list.toArray();
        System.out.println(Arrays.toString(arr));

        //8.拓展功能，把别人集合的数据加给自己
        Collection<String> c1=new ArrayList<>();
        c1.add("杨夫人");
        c1.add("紫衫龙王");

        Collection<String> c2=new ArrayList<>();
        c2.add("殷素素");
        c2.add("神医夫人");
        //把集合c2的数据全部加到c1
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
