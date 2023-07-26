package com.itheima.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 多态对于方法：编译看左边，运行看右边
        //多态对于变量：编译看左边，运行看左边
        People p1=new Teacher();
        p1.run();
        System.out.println(p1.name);

        People p2=new Student();
        p2.run();
        System.out.println(p2.name);

    }
}
