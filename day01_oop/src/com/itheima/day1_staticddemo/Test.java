package com.itheima.day1_staticddemo;

public class Test {
    public static void main(String[] args) {
        //目标：掌握static修饰的类变量的应用场景
        User u1=new User(6);
        User u2=new User(36);
        User u3=new User(16);
        User u4=new User(26);
        User u5=new User(46);
        User u6=new User(56);
        User u7=new User(66);

        //想要知道创建了多少个对象
        System.out.println("个数："+User.number);

        User.printHelloWorld();

        u1.printHelloWorld();

        u1.printPass();

        String password=ItheimaUtil.createVerifyCode(6);
        System.out.println(password);

    }
}
