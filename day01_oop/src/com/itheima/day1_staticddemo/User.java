package com.itheima.day1_staticddemo;

public class User {
    // 1.定义一个类变量记录创建的个数
    public static int number;
    public int age;
    // 2.每次创建对象，都要用构造器
    public User(){
        // 同一个类中访问类变量，可以省略类名不写
        number++;
    }

    //代码块：静态代码块
    //静态代码块的特点：与类一起优先加载，自动执行一次
    //作用：可以用于对类的静态变量进行初始化赋值，自动后就可以直接使用
    static{
        System.out.println("======静态代码块被触发执行了======");
        number=0;

    }

    public User(int age){
        this.age=age;
    }

    // 静态方法，属于类的方法，可以直接类名.方法名使用，
    // 也可以对象名.方法名使用
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    //实例方法：属于对象的方法
    public void printPass(){
        System.out.println((age>=18)?"成年了":"未成年");
    }
}
