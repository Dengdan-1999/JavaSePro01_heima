package com.itheima.d2_polymorphism;

public class Teacher extends People {
    public String name="子类teacher的名称";
    @Override
    public void run(){
        System.out.println("老师跑的气喘吁吁~");
    }

    public void go(){
        System.out.println("子类teacher go~");
    }
}
