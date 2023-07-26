package com.itheima.d2_lambda;

//用lambda简化函数式接口的匿名内部类，
//格式：(被重写方法的形参列表)->{被重写方法的方法体代码}

public class LambdaTest1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Swimming s=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐地爬呀爬，1.0版本~~");
            }
        };
        s.swim();

        Swimming s2=()->{
            System.out.println("学生快乐地爬呀爬，2.0版本~~");
        };
        s2.swim();

    }
}

@FunctionalInterface //函数式接口的校验注解，要求必须式接口，而且接口中只能有一个抽象方法，否则会报错
    //只有一个抽象方法的接口叫函数式接口
interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void run();
}