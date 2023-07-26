package com.itheima.d4_collection_travesal;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //目标：掌握List的特有方法
        //1.创建一个List集合对象()
        List<String> list=new ArrayList<>();
        list.add("大奶妹妹");
        list.add("妖娆面孔");
        list.add("白嫩皮肤");
        list.add("粉嫩蜜穴");

        //2.给某个位置插入一个数据
        list.add(1,"男人都想要的尤物");
        System.out.println(list);

        //3.根据索引删除数据
        System.out.println(list.remove(2));
        System.out.println(list);

        //4.修改索引位置处的数据
        System.out.println(list.set(0,"爆乳妹子"));
        System.out.println(list);

        //5.根据索引取数据
        System.out.println(list.get(2));
    }
}
