package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //目标：掌握Collection集合的遍历方式二：增强for(foreach)遍历
        //2.准备一个集合
        Collection<String> list=new ArrayList<>();
        list.add("敏敏");
        list.add("若若");
        list.add("小昭");
        list.add("蛛儿");

        //2.增强for循环遍历集合
        for(String ele:list){
            System.out.println(ele);
        }

        //3.增强for也可以遍历数组
        int[] ages={19,18,34,25};
        for(int age:ages){
            System.out.println(age);
        }
    }
}
