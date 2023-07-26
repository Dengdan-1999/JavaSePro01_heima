package com.itheima.d11_method_override;
//目标：掌握方法重写
public class Text {
    public static void main(String[] args) {
        //目标：先认识方法重写，再看其他应用
        Dog d=new Dog();
        d.run();//就近原则，执行子类的方法
    }
}

class Dog extends Animal{
    //方法重写：子类中写了一个方法名称和形参列表与该父类方法一样的，就是方法重写
    //声明不变，重新实现
    @Override //重写注释
    public void run(){
        System.out.println("狗跑得贼快~~");
    }
}

class Animal{
    public void run(){
        System.out.println("动物可以跑~~");
    }
}