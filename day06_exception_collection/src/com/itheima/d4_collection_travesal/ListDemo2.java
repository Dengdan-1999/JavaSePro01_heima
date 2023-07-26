package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //目标：掌握list集合的遍历方式
        List<String> list=new ArrayList<>();
        list.add("张馨予");
        list.add("徐冬冬");
        list.add("柳岩");
        list.add("妲己");
        list.add("小安");
        list.add("馨儿");
        System.out.println(list);
//
//        //1.for循环
//        for(int i=0;i<list.size();i++){
//            String s=list.get(i);
//            System.out.println(s);
//        }
//        //2.迭代器
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        //3.增强for循环
//        for(String s:list){
//            System.out.println(s);
//        }

        //4.lambda
        list.forEach(s-> System.out.println(s));
    }
}
