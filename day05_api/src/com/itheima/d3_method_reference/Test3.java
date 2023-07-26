package com.itheima.d3_method_reference;

import java.util.Arrays;
import java.util.Comparator;
//特定类型的方法引用：
//若某个Lambda表达式只是调用一个实例方法，并且前面参数列表中的第一个参数式作为方法的主调，
// 后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用。
public class Test3 {
    public static void main(String[] args) {
        //目标：掌握特定类型的方法引用
        String[] names={"张无忌","赵敏","小昭","周芷若","殷离"};
        String[] names2={"Amber","Elle","Eason","Canbrella","Bobo"};

        //需求：按照首字母排序，忽略大小写
        /*
        Arrays.sort(names2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });



        //简化版本1.0
        Arrays.sort(names2,(o1,o2)->o1.compareToIgnoreCase(o2));
 */
        //简化版本2.0
        Arrays.sort(names2,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names2));


    }
}
