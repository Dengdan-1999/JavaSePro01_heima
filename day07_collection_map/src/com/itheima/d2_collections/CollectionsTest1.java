package com.itheima.d2_collections;

import java.util.*;

public class CollectionsTest1 {
    public static void main(String[] args) {
        //1.public static<T> boolean addAll(Collection<? super T>c,T...elements):为集合批量添加数据
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"张三","王麻子","赵敏","张无忌");
        System.out.println(names);

        //2.public static void shuffle(List<?> list) 只能打乱list集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T> list):对List集合中的元素进行升序排序
        List<Double> scores=new ArrayList<>();
        Collections.addAll(scores,99.5,88.0,78.5,98.6,70.0);
        System.out.println(scores);
        Collections.sort(scores);//默认升序排列
        System.out.println(scores);

        //排序自定义对象，
        List<Beauty> beauties=new ArrayList<>();
        Beauty b1=new Beauty("赵敏",23,165);
        Beauty b2=new Beauty("周芷若",24,166);
        Beauty b3=new Beauty("小昭",20,163);
        Beauty b4=new Beauty("殷离",21,164);
        Collections.addAll(beauties,b1,b2,b3,b4);

        //方法1：对象实现Comparable接口，重写compare方法，指定大小比较规则
//        Collections.sort(beauties);
        for(Beauty b:beauties){
            System.out.println(b.toString());
        }


        // 4.public static<T> void sort(List<T> list,Comparator<? super T> c):
        //对List集合中元素，按照比较器对象指定的规则进行排序
        //方法2：指定Comparator比较器对象，再指定比较规则
        Collections.sort(beauties, new Comparator<Beauty>() {
            @Override
            public int compare(Beauty o1, Beauty o2) {
                if(o1.getHeight()>o2.getHeight()){
                    return -1;
                }
                else if(o1.getHeight()<o2.getHeight()){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });

        for(Beauty b:beauties){
            System.out.println(b.toString());
        }

    }
}
