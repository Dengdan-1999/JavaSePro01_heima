package com.itheima.d11_multiextends;

public class Test implements A,B,C{
    public static void main(String[] args) {
        //目标：理解接口的多继承
        //类与类：单继承，一个类只能继承一个直接父类
        //类与接口：多实现，一个类可以实现多个接口
        //接口与接口：多继承，一个接口可以同时继承多个接口
        Test t=new Test();
        t.test1();
        t.test2();
        t.test3();
    }

    @Override
    public void test1(){
        System.out.println("test1~~");
    }
    @Override
    public void test2(){
        System.out.println("test2~~");
    }
    @Override
    public void test3(){
        System.out.println("test3~~");
    }

}

