package com.itheima.d2_polymorphism;

public class Student extends People {
    public String name="子类student的名称";
    @Override
    public void run() {
        System.out.println("学生跑的哈哈大笑~");
    }

    public void go(){
        System.out.println("子类student go~");
    }
}
