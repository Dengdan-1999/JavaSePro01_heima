package com.itheima.day1_staticddemo;
// 目标：掌握单例设计模式，一般分为三步，有很多中实现方式，下面为其中之一
public class A {
    //2.定义一个静态变量记住一个对象
    private static A a=new A();

    //1.构造函数私有
    private A(){

    }

    //3.提供一个静态方法，返回对象
    public static A getInstance(){
        return a;
    }
}
