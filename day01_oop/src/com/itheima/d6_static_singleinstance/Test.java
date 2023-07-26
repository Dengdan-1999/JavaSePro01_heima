package com.itheima.d6_static_singleinstance;

public class Test {
    public static void main(String[] args) {
        //目标：掌握单例设计模式
        A a1=A.getInstance();


        B b1=B.getInstance();
        B b2=B.getInstance();
        System.out.println(b1);
        System.out.println(b2);

    }
}
