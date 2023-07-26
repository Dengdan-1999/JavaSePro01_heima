package com.itheima.d1_polymorphism;

public class Student extends People{
    public String name="子类student的名称";
    @Override
    public void run() {
        System.out.println("学生跑的哈哈大笑~");
    }
}
