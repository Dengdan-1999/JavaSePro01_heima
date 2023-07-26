package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //目标：掌握Collection集合的遍历方式一：迭代器遍历
        //1.准备一个集合
        Collection<String> list=new ArrayList<>();
        list.add("西施");
        list.add("貂蝉");
        list.add("杨贵妃");
        list.add("昭君");
        System.out.println(list);

        //2.拿到集合的迭代器对象
        Iterator<String> it=list.iterator();

//        //3.取第一个数据
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        //4.使用循环改进迭代器遍历
        while(it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }
    }
}
