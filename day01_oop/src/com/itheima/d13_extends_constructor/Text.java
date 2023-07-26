package com.itheima.d13_extends_constructor;

public class Text {
    public static void main(String[] args) {
        //子类的全部构造器，都会先调用父类的构造器，再执行自己
        //
//        Children1 c=new Children1();
        Children2 c2=new Children2("dengdan",23,3600000000l);

    }
}

class Parent{
    public String name;
    public int age;

    public Parent(){
        System.out.println("这是父类的无参构造器");
    }

    public Parent(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("这是父类的有参构造器");
    }
}

class Children1 extends Parent{
    public String name;
    public Children1(){
        System.out.println("这是Children1的无参构造器~");
    }
    public Children1(String name,int age){
        this.name=name;
        this.age=age;
    }

}

class Parent2{
    public String name;
    public int age;

    public Parent2(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("这是父类的有参构造器");
    }
}

class Children2 extends Parent2{
    public long wealth;
    public Children2(String name,int age,long wealth){
        super(name,age);   //父类没有无参构造器，
        // 必须在子类构造器的第一行手写super(...),指定去调用父类的有参构造器
        this.name=name;
        this.age=age;
        this.wealth=wealth;
        System.out.println("这是Children2的3个参数构造器~~");
    }

}