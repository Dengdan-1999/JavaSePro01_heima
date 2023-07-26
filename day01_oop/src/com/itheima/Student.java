package com.itheima;

import java.util.ArrayList;

public class Student {
    public static String schoolName="黑马程序员";
    public static ArrayList<String> list=new ArrayList<>();
    //1.代码块，有static修饰的是静态代码块
    //静态代码块的特点：与类一起优先加载，自动执行一次
    //作用：可以用于对类的静态变量进行初始化赋值，启动后就可以直接使用
    static{
        System.out.println("===静态代码块被触发执行了===");
        list.add("东");
        list.add("南");
    }

    public static void main(String[] args) {
        System.out.println("==main方法执行了==");
        System.out.println(list);
    }

}
