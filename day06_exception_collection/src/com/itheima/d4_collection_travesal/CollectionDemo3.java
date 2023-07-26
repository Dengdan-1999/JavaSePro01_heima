package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //目标：掌握集合的遍历方式三：
        Collection<String> list=new ArrayList<>();
        list.add("张雨绮");
        list.add("张馨予");
        list.add("邬婧婧");
        list.add("柳岩");
        list.add("徐冬冬");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //简化版本
        list.forEach(s->{
            System.out.println(s);
        });

    }
}
