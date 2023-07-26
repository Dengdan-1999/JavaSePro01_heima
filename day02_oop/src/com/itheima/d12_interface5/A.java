package com.itheima.d12_interface5;

public interface A {
    /*
    1. 默认方法，使用default修饰，默认会被加上public修饰
     */
    default void test1(){
        System.out.println("这是默认方法test1");
        test2();
    }

    /*
    2.私有方法：必须用private 修饰(JDK9开始才支持)
     */
    private void test2(){
        System.out.println("这是私有方法~~");
    }
    /*
    3.类方法，使用static修饰，默认会被加上public修饰，只能用接口名来调用
     */
    static void test3(){

    }
}
