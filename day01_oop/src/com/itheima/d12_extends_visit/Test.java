package com.itheima.d12_extends_visit;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚子类中访问其他成员的特点：就近原则(纯语法)
        Zi z=new Zi();
        z.showName();
    }
}

class Zi extends Fu{
    String name="子类name";
    public void showName(){
        String name="局部名称";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(name2);
    }
}

class Fu{
    String name="父类name";
    String name2="父类name2";
}