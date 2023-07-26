package com.itheima.d6_static_singleinstance;
//单例设计模式改造后的类：单例类
public class A {
    //2.定义一个静态变量用于记住类的一个对象
    private static A a=new A();

    //1.构造器私有化
    private A(){

    }

    //3.提供一个静态方法，返回对象
    public static A getInstance(){
        return a;
    }
}
