package com.itheima.d9_extends_modifier1;
//目标：识别权限修饰符

public class Parent {
    //1.private :只能在本类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //2.缺省：本类中，同一个包中的其他类中
    void method(){
        System.out.println("method");
    }
    //3.protected(子类访问权限)：本类中，同一个包中的其他类中，子类可以房访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //4.public:任意地方
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
        p.privateMethod();
        p.publicMethod();
        p.method();
        p.protectedMethod();

    }
}
