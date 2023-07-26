package com.itheima.d6_static_singleinstance;
//设计懒汉式单例设计模式
public class B {
    //2.定义一个静态变量用于存储类的一个对象
    private static B b;

    //1.构造器私有
    private B(){

    }

    //3.提供一个静态方法，保证返回类的一个单一对象
    public static B getInstance(){
        if(b==null){
            //说明是第一次来拿对象，要创建对象
            b=new B();
        }
        return b;
    }

}
